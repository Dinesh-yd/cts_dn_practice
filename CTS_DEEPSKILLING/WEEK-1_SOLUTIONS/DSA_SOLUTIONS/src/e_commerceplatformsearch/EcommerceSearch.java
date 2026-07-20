package e_commerceplatformsearch;

public class EcommerceSearch {

    public static Product linearSearch(Product[] products, int targetId) {

        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {

        int lo = 0;
        int hi = products.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (products[mid].productId == targetId) {
                return products[mid];
            }
            // Search Right part
            if (products[mid].productId < targetId) {
                lo = mid + 1;
            } else {
                hi = mid - 1; // Search Left Part
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(1001, "Lappy", "Electronics"),
                new Product(1002, "Mobile", "Electronics"),
                new Product(1003, "Boots", "Fashion"),
                new Product(1004, "Watch", "Accessories"),
                new Product(1005, "HandBag", "Fashion")
        };

        int searchId = 1004;

        Product res1 = linearSearch(products, searchId);

        System.out.println("Linear Search Result:"); // Takes Time Complexity of O(n)
        System.out.println(res1);

        Product res2 = binarySearch(products, searchId);

        System.out.println("Binary Search Result:");// Takes Time Complexity of O(logn) as it decreses the search space
        System.out.println(res2);
    }
}
/*
  OUTPUT:-
  C:\Users\swaro\.jdks\ms-21.0.9\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=55575:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\swaro\OneDrive\Desktop\CTS_DEEPSKILLING\WEEK-1_SOLUTIONS\DSA_SOLUTIONS\out\production\DSA_SOLUTIONS e_commerceplatformsearch.EcommerceSearch
   Linear Search Result:
   Product{productId=1004, productName='Watch', category='Accessories'}

  Binary Search Result:
  Product{productId=1004, productName='Watch', category='Accessories'}

Process finished with exit code 0
 */