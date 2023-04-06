package org.redrover;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringUtils.abbreviate("Hello world!", 11));
        System.out.println(Utils_9.abbr("Hello world!", 11));

        testAbbr();

    }

    private static void testAbbr(){
        if(!"H...".equals(Utils_9.abbr("Hello world!", 4))){
            System.out.println("bugwith 4 chars ");
        }

        if(!"Hel...".equals(Utils_9.abbr("Hello world!", 6))){
            System.out.println("bug at 6 chars ");
        }

        if(!"Hello...".equals(Utils_9.abbr("Hello world!", 8))){
            System.out.println("bug with 8 chars ");
        }

        if(6 != Utils_9.sum(2,4)){
            System.out.println("method sum has a bug ");
        }

    }


}