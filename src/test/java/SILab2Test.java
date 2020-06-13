import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.graalvm.compiler.options.OptionType.User;

class SILab2Test {

    private final SILab2  haha= new SILab2();
    //pravenje na objekti
    private User korisnik1;
    private User korisnik2;
    private User korisnik3;
    private User korisnik4;
    private User korisnik5;
    private User korisnik6;
    private User korisnik7;
    private static List<String> listaKorisnici;
    private static List<String> listaVtora;

    //prvo imame before all
    @BeforeAll
    static void init(){
        System.out.println("Inicijalizacija na potrebnite parametri");
        korisnik1 = null;
        korisnik2 = new User("sangoky","razlicen!23","martinshelby@outlook.com");
        korisnik3 = new User("sangoky","M123!456","martinshelby@outlook.com");
        korisnik4 = new User(null, "dangev","martin@outlook.com");
        korisnik5 = new User("maki567",null,"dangev123@yahoo.com");
        korisnik6 = new User("sangoky", "m123!456", "martinshelby@outlook.com");
        listaKorisnici = new ArrayList<>(3);
        listaVtora = new ArrayList<>(4);
    }
    //na kraj
    @AfterAll
    static void kraj()
    {
        System.out.println("Site testovi se zavrseni");
    }
    //sega imame dve funkcii za tocka 3 i tocka 4 da gi probame testovite
    @Test
    void function() {
    }

    @Test
    void EveryStatement(){
        assert ()-> assertFalse(SILab2.function(korisnik1,listaKorisnici));
        assert ()->assertFalse(SILab2.function(korisnik2,listaKorisnici));
        assert ()-> assertTrue(SILab2.function(korisnik3,listaKorisnici));
    }
    @Test
    void MultipleOption(){
        assert ()-> assertFalse(SILab2.function(korisnik4,listaVtora));
        assert ()-> assertFalse(SILab2.function(korisnik5,listaVtora));
        assert ()-> assertTrue(SILab2.function(korisnik3,listaVtora));
        assert ()-> assertFalse(SILab2.function(korisnik6,listaVtora));
    }
}