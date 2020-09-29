package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*
Testira se sajt http://automationpractice.com/index.php.
Za rad sa elementima koji se nalaze na web stranici koristiti Selenium, a za pisanje testova TestNG. Primeniti Page Object Model.

-Testirati da li kada se na početnoj stranici sajta mišem stane na dugme WOMEN,
a zatim odatle odabere SummerDresses odlazi na korektnu stranu.

-Testirati da li kada se na početnoj stranici sajta mišem stane na dugme DRESSES,
 a zatim odatle odabere SUMMER DRESSES odlazi na korektnu stranu.

-Proverite da li prethodne dve tačke vode na istu stranicu.

-Odabrati drugu haljinu koja se nalazi u Summer Dresses ponudi. Staviti u korpu dve takve haljine, M veličine u beloj boji.

-Proveriti da li se u korpi zaista nalaze dve haljine sa odgovarajućim nazivom,  u beloj boji, M veličine.

-Testirati da li radi ‘search’ bar. Ukucati ‘yellow’ i ispitati rezultat pretrage. Očekivan ishod je prikaz tri artikla,
 pri čemu svaki od njih ima mogućnost odabira žute boje.

-Kliknuti na “Contact us” i proveriti formu za slanje korisničkih pitanja.

-Proveriti da li ikonice koje se nalaze u meniju na kraju stranice vode na odgovarajuće adrese
 (ikonice za Facebook, Twitter, YouTube...)

-Pronaći kako da se automatski izgeneriše set podataka,
i kreirati xlsx ili xls fajl koji je popunjen podacima potrebnim za slanje 30 pitanja.

-Poslati 30 pitanja pri čemu se podaci o svakoj poruci čitaju iz xlsx ili xls fajla.
 Za svaku poruku proveriti da li je slanje bilo uspešno.

-Napisati Bug Report.

Bonus:
-Napraviti jedan test suite pomoću koga će se pokrenuti testovi iz svih TestNG klasa.
 */
public class HomePage {

    public static String url = "http://automationpractice.com/index.php";
}