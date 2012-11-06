/*
 * Copyright Notice ====================================================
 * This file contains proprietary information of Hewlett-Packard Co.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2009   All rights reserved. ======================
 */

package zhwb.observerPattern;

public class OberserverTest
{

    /**
     * Description goes here.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        EqualsNotification a = new EqualsNotification();
        HappyObserver b = new HappyObserver();
        a.addObserver(b);
        a.testRandom();
    }

}
