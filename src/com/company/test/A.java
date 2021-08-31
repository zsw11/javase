package com.company.test;

import lombok.*;

import java.util.List;

/**
 * @author zsw
 * @date 2021/8/18 13:49
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class A {
    private String AName;
    @Singular(value = "a")
    private List<a> aList;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
//    private class a{
    public static class a{
        private String aName;
    }

}
