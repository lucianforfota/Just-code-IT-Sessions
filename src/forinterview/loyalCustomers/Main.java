package forinterview.loyalCustomers;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //data si ora, id-ul paginii, id-ul clientului

        //clientii care au vizitat in ambele zile site-ul si care au vizitat
        //minim pagini diferite


    }

    public static Map<Integer, Set<Integer>> getUniquePAgesByCustomer(List<SiteEntry> day1Entries, List<SiteEntry> day2Entries) {
        Map<Integer, Set<Integer>> uniquePagesByCustomer = new HashMap<>();
        for (SiteEntry day1Entry : day1Entries) {
            //daca customerid-ul lui day1Entry nu este in mapa
            if (!uniquePagesByCustomer.containsKey(day1Entry.getCustomerId())) {
                //bag in mapa ca si cheie customerid-ul lui day1Entry si ca si valoare un set cu pageId-ul lui day1Entry
                Set<Integer> uniquePages = new HashSet<>();
                uniquePages.add(day1Entry.getPageId());
                uniquePagesByCustomer.put(day1Entry.getCustomerId(), uniquePages);
            }
            //altfel
            else {
                //se adauga in set (valoarea de la cheia customerId-ul lui day1Entry) pageId-ul lui day1Ntry
                uniquePagesByCustomer.get(day1Entry.getCustomerId()).add(day1Entry.getPageId());
            }
        }

        for (SiteEntry day2Entry : day1Entries) {
            //daca customerid-ul lui day1Entry nu este in mapa
            if (!uniquePagesByCustomer.containsKey(day2Entry.getCustomerId())) {
                //bag in mapa ca si cheie customerid-ul lui day1Entry si ca si valoare un set cu pageId-ul lui day1Entry
                Set<Integer> uniquePages = new HashSet<>();
                uniquePages.add(day2Entry.getPageId());
                uniquePagesByCustomer.put(day2Entry.getCustomerId(), uniquePages);
            }
            //altfel
            else {
                //se adauga in set (valoarea de la cheia customerId-ul lui day1Entry) pageId-ul lui day1Ntry
                uniquePagesByCustomer.get(day2Entry.getCustomerId()).add(day2Entry.getPageId());
            }
        }

        return uniquePagesByCustomer;
    }


    public static Set<Integer> getMinTwoUniquePagesCustomers(Map<Integer, Set<Integer>> uniquePagesByCustomer) {
        Set<Integer> minTwoUniquePagesCustomers = new HashSet<>();
        for (Integer customerId : uniquePagesByCustomer.keySet()) {
            if (uniquePagesByCustomer.get(customerId).size() >= 2) {
                minTwoUniquePagesCustomers.add(customerId);
            }
        }
        return minTwoUniquePagesCustomers;
    }

    public static Set<Integer> getLoyalCustomers(List<SiteEntry> day1Entries, List<SiteEntry> day2Entries) {
        //generam mapa cu set-uld e pagini unice vizitate de fiecare client
        Map<Integer, Set<Integer>> uniquePagesByCustomer = getUniquePAgesByCustomer(day1Entries, day2Entries);


        //extragem din mapa doar clientii care au minim 2 pagini unice vizitate
        Set<Integer> minTwoUniquePagesCustomers = getMinTwoUniquePagesCustomers(uniquePagesByCustomer);


        Set<Integer> loyalCustomers = new HashSet<>();

        for (Integer customerId : minTwoUniquePagesCustomers) {
            if (hasVisitedBothDays(customerId, day1Entries, day2Entries)) {
                loyalCustomers.add(customerId);
            }
        }

        return loyalCustomers;

        //pentru fiecare client extras
        //verificam daca a vizitat site-ul in ambele zile
        //daca da, adaugam la lista de clienti loiali
    }
}