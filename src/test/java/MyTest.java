import com.baomidou.mybatisplus.solon.plugins.pagination.Page;
import com.da.App;
import com.da.mapper.UserMapper;
import com.da.po.User;
import com.da.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.noear.solon.annotation.Inject;
import org.noear.solon.test.SolonJUnit4ClassRunner;
import org.noear.solon.test.SolonTest;

/**
 * Author Da
 * Description: <br/>
 * 三十年生死两茫茫，写程序，到天亮。
 * 千行代码，Bug何处藏。
 * 纵使上线又怎样，朝令改，夕断肠。
 * 领导每天新想法，天天改，日日忙。
 * 相顾无言，惟有泪千行。
 * 每晚灯火阑珊处，夜难寐，又加班。
 * Date: 2022-05-11
 * Time: 14:29
 */
@RunWith(SolonJUnit4ClassRunner.class)
@SolonTest(App.class)
public class MyTest {

    @Inject
    UserService service;

    @Inject
    UserMapper mapper;

    @Test
    public void test01() {
//        获取所有的用户
        service.list().forEach(System.out::println);
    }

    @Test
    public void test02() {
//        逻辑删除
        System.out.println(service.removeById(911327233));
    }

    @Test
    public void test03() {
//        分页
        Page<User> page = service.page(new Page<>(1, 2));
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println("====================");
        page.getRecords().forEach(System.out::println);
    }

    @Test
    public void test04() {
        System.out.println(mapper.get());
    }

}
