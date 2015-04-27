package ref

import net.juniper.jspace.ems.yang.JNC
import net.juniper.jspace.ems.yang.usermgt.users.User

/**
 * Created by maxin on 15-1-12.
 */
object Test extends  App{
  val a=Array("d","b")
  a(0)="ddd"
  val b=new Array[String](2)
  b(0)="ddd"
  b(1)="asdf"


//    12        Method[] methods = JNC.class.getDeclaredMethods();
//    13        for (Method method : methods) {
//      14            System.out.println("method:" + method.getName());// 方法名
//      15
//      16            // //////////////方法的参数
//      17            System.out.println(" paramTypeType: ");
//      18            Type[] paramTypeList = method.getGenericParameterTypes();// 方法的参数列表
//      19            for (Type paramType : paramTypeList) {
//        20                System.out.println("  " + paramType);// 参数类型
//        21                if (paramType instanceof ParameterizedType)/**//* 如果是泛型类型 */{
//          22                    Type[] types = ((ParameterizedType) paramType)
//          23                            .getActualTypeArguments();// 泛型类型列表
//          24                    System.out.println("  TypeArgument: ");
//          25                    for (Type type : types) {
//            26                        System.out.println("   " + type);
//            27                    }
//          28                }
//        29            }
//      30
//      31            // //////////////方法的返回值
//      32            System.out.println(" returnType: ");
//      33            Type returnType = method.getGenericReturnType();// 返回类型
//      34            System.out.println("  " + returnType);
//      35            if (returnType instanceof ParameterizedType)/**//* 如果是泛型类型 */{
//        36                Type[] types = ((ParameterizedType) returnType)
//        37                        .getActualTypeArguments();// 泛型类型列表
//        38                System.out.println("  TypeArgument: ");
//        39                for (Type type : types) {
//          40                    System.out.println("   " + type);
//          41                }
//        42            }
//      43
//      44        }
//    45
//    46    }
//  47

}
