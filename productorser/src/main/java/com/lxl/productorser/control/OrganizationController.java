package com.lxl.productorser.control;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lxl.productorser.bean.Organization;
import com.lxl.productorser.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.awt.print.Printable;
import java.util.List;

@RestController
@RequestMapping(value="organization")
public class OrganizationController {

    @Autowired
    private OrganizationService orgService;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Organization getOrganization(@PathVariable("id") String id) {
        Organization o =  orgService.getOrg(id);
        return o;
    }

    @RequestMapping(value="/list",method = RequestMethod.GET)//pagehelper分页
    public PageInfo findAll(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "1") Integer size) {
        PageHelper.startPage(page, size);
        List<Organization> o =  orgService.findAllByJpa();
        PageInfo pageInfo = new PageInfo(o);
        return pageInfo;
    }

    @RequestMapping(value="/findAllByPagingAndSorting",method = RequestMethod.GET)//PagingAndSortingRepository分页
    public Iterable<Organization> findAllByPagingAndSorting(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "1") Integer size) {
//        Pageable pageable =  new Pageable() {
//            @Override
//            public int getPageNumber() {
//                return 0;
//            }
//
//            @Override
//            public int getPageSize() {
//                return 1;
//            }
//
//            @Override
//            public int getOffset() {
//                return 0;
//            }
//
//            @Override
//            public Sort getSort() {
//                return null;
//            }
//
//            @Override
//            public Pageable next() {
//                return null;
//            }
//
//            @Override
//            public Pageable previousOrFirst() {
//                return null;
//            }
//
//            @Override
//            public Pageable first() {
//                return null;
//            }
//
//            @Override
//            public boolean hasPrevious() {
//                return false;
//            }
//        };
        Pageable pageable = new PageRequest(page,size);
        Page<Organization> o =  orgService.findAllByPagingAndSorting(pageable);
        return o;
    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.PUT)
    public void updateOrganization( @PathVariable("organizationId") String orgId, @RequestBody Organization org) {
        orgService.updateOrg( org );

    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.POST)
    public void saveOrganization(@RequestBody Organization org) {
        orgService.saveOrg( org );
    }

    @RequestMapping(value="/{organizationId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrganization( @PathVariable("organizationId") String orgId) {
        orgService.deleteOrg(orgId);

    }

}
