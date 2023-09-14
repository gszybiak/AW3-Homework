package firstHtmlWebsite.AW3;

import firstHtmlWebsite.AW3.email.Mail;
import firstHtmlWebsite.AW3.email.SendEmail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;


@Controller
public class SendMail {

    @GetMapping("/api")
    @ResponseBody
    public String send(@RequestParam String name, @RequestParam String surname,
                       @RequestParam LocalDate date, @RequestParam String town,
                       @RequestParam String password, @RequestParam String email) {

        Mail mail = new Mail(name, surname, date, town, password, email);
        if(SendEmail.sendEmail(mail))
            return "Mail został wysłany.";
        else
            return "Błąd wysłania maila";
    }

}
