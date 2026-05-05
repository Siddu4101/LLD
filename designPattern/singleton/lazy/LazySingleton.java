package designPattern.singleton.lazy;

/*
* Here we will create the instance only if it is not present and if it is present send it
* Issue 1:
*   if >1 thread enters it will create >1 instance
*   so we need to use the synchronized block
*
* */
public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton(){}/*private constructor*/


    /* Issue: 1
     *    getInstance is not a thread safe and if >1 thread enters it will create >1 instance
     * * * */
//    public static LazySingleton getInstance(){ /*to access instance from outside we have public method*/
//        if(INSTANCE == null)/*if instance is not resent create one else resend the old one*/
//            INSTANCE = new LazySingleton();
//         return INSTANCE;
//    }


    /*synchronized method avoids the multi thread access at a time but
    *  Issue: 2
    *       now we have code block which makes the program slow locking and unlocking so we need to decrease the
    *       region of interest where synchronization is needed
    *   */
//    public static synchronized LazySingleton getInstance(){ /*to access instance from outside we have public method*/
//        if(INSTANCE == null)/*if instance is not resent create one else resend the old one*/
//            INSTANCE = new LazySingleton();
//        return INSTANCE;
//    }


    /*synchronized method avoids the multi thread access at a time but
     *  Issue: 3
     *       Now we have decreased the ROI but we can make it better by avoiding synchronization block check everytime
     *       by moving condition above that but that introduces the issue again there might be the possibility that multiple
     *       threads pass the first if and in second if 1st thread creates the object and second thread waits and again creates the object so we need 2 checks
     *       that solves the problem
     *   */
//    public static LazySingleton getInstance(){ /*to access instance from outside we have public method*/
//           synchronized (LazySingleton.class) {
//               if (INSTANCE == null)/*if instance is not resent create one else resend the old one*/
//                   INSTANCE = new LazySingleton();
//           }
//        return INSTANCE;
//    }


    /*This solves all the above mentioned problems*/
    public static LazySingleton getInstance(){ /*to access instance from outside we have public method*/
        if(INSTANCE == null) { /*to introduce the synchronous block only if there is no insstance*/
            synchronized (LazySingleton.class) {
                if (INSTANCE == null)/*if the first if was passed by multi thread this second check avoids multi instance creation*/
                    INSTANCE = new LazySingleton();
            }
        }
        return INSTANCE;
    }
}
