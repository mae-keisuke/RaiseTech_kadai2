import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company1 = new Company(001, "野村総合研究所", "IT", 5739, 37.8, 1051);
        Company company2 = new Company(002, "三菱総合研究所", "IT", 826, 41.5, 955);
        Company company3 = new Company(003, "ISID", "IT", 1216, 38.2, 832);
        Company company4 = new Company(004, "富士通", "IT", 24906, 42.2, 804.4);
        Company company5 = new Company(005, "新日鉄ソリューションズ", "IT", 2415, 37.6, 798.3);
        Company company6 = new Company(006, "リクルート", "人材", 17327, 38.9, 950.6);

        List<Company> companyList = List.of(company1, company2, company3, company4, company5, company6);

        for (Company company : companyList) {
            if (company.getIndustry() == "IT") {
                System.out.print("企業名" + company.getId() + "：" + company.getName());
                System.out.print("　従業員数：" + company.getEmployeeNumber() + "人");
                System.out.print("　平均年齢：" + company.getAveAge() + "歳");
                System.out.print("　平均年収：" + company.getAveMoney() + "万円");
                System.out.println("　総人件費：" + company.getEmployeeNumber() * company.getAveMoney() + "万円");
            } else if (company.getIndustry() != "IT") {
                System.out.println("企業名" + company.getId() + "：" + "業界が違います");
            }

        }
    }
}