package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

//restful风格
//发出Delete请求
//从请求 Delete /repos/:owner/:repo/issues/:issue_number/lock 中拿到参数
@lombok.NoArgsConstructor
@lombok.Data
@lombok.NoArgsConstructor
@lombok.Data
@RestController//可以指定一个根路径
@RequestMapping("repos")//指定根路径为repos
public class IssueController {
    @JsonProperty("tittle")
    private String tittle;

    @DeleteMapping("/{owner}/{repo}/issues/{issue_number}/lock")//把delete映射给它，写明参数
    //发出的请求会自动被Spring处理，会识别每个路径中的参数 分别绑定到对应的参数上
    public void unlock(
            //把http请求的路径中的参数绑定到某个方法参数上，使得该方法调用自动拥有
            //springMVC提供的自动参数绑定，自动从发起的http请求中解析参数 并绑定到对应的方法上
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @PathVariable("issue_number") String issue_number
    ) {
        System.out.println("owner = " + owner);
        System.out.println("repo = " + repo);
        System.out.println("issue_number = " + issue_number);
    }

    //识别路径参数，并从body里拿东西
    @PostMapping("/{owner}/{repo}/issues")
    public void creat(
            @PathVariable("owner") String owner,
            @PathVariable("repo") String repo,
            @RequestBody Object object
    ) {
        System.out.println("object = " + object);
    }

}
