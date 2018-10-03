
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped

public class ManagedBeanSinifi {

    private String firstName;
    private String lastName;
    private String firstName5 = "Mucahit";
    private String lastName5 = "Topçu";
    private String city;
    private String cityArray[] = {"İstanbul", "Ankara", "Düzce", "Kocaeli"};
    private String proLang, proLang5 = "Java";
    List<String> proLangArray = new ArrayList<String>();
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName5() {
        return firstName5;
    }

    public void setFirstName5(String firstName5) {
        this.firstName5 = firstName5;
    }

    public String getLastName5() {
        return lastName5;
    }

    public void setLastName5(String lastName5) {
        this.lastName5 = lastName5;
    }

    public String getProLang5() {
        return proLang5;
    }

    public void setProLang5(String proLang5) {
        this.proLang5 = proLang5;
    }

    public List<String> getProLangArray() {
        return proLangArray;
    }

    public void setProLangArray(List<String> proLangArray) {
        this.proLangArray = proLangArray;
    }

    public String getProLang() {
        return proLang;
    }

    public List<String> getproLangArray() {
        return proLangArray;
    }

    public void setproLangArray(List<String> proLangArray) {
        this.proLangArray = proLangArray;
    }

    public void setProLang(String proLang) {
        this.proLang = proLang;
    }

    public ManagedBeanSinifi() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String[] getCityArray() {
        return cityArray;
    }

    public void setCityArray(String[] cityArray) {
        this.cityArray = cityArray;
    }

}
