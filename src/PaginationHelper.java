//package com.company.Kata;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//// TODO: complete this object/class
//
//public class PaginationHelper<I> {
//  public static void main(String[] args) {
//    PaginationHelper<Character> helper = new PaginationHelper<>(Arrays.asList('a', 'b', 'c', 'd')
//            , 2);
//    System.out.println("itemCount: " + itemCount(helper));
//    System.out.println("pageCount: " + pageCount(helper, 2));
//
//  }
//  /**
//   * The constructor takes in an array of items and a integer indicating how many
//   * items fit within a single page
//   */
//  public PaginationHelper(List<I> collection, int itemsPerPage) {
//
//  }
//
//  /**
//   * returns the number of items within the entire collection
//   */
//  public static int itemCount(List<I> collection) {
//     return collection.size();
//  }
//
//  /**
//   * returns the number of pages
//   */
//  public static int pageCount(List<I> collection, int itemsPerPage) {
//    return collection.size() / itemsPerPage;
//  }
//
//  /**
//   * returns the number of items on the current page. page_index is zero based.
//   * this method should return -1 for pageIndex values that are out of range
//   */
//  public int pageItemCount(int pageIndex) {
//    return pageIndex ;
//  }
//
//  /**
//   * determines what page an item is on. Zero based indexes
//   * this method should return -1 for itemIndex values that are out of range
//   */
//  public int pageIndex(int itemIndex) {
//    return itemIndex;
//  }
//}