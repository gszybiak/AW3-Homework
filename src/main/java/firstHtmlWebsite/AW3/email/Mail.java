package firstHtmlWebsite.AW3.email;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Mail {
    String name;
    String surname;
    LocalDate date;
    String town;

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                ", town='" + town + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    String password;
    String email;
}
