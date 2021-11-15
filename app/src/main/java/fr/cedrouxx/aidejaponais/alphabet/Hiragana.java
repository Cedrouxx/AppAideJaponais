package fr.cedrouxx.aidejaponais.alphabet;

public class Hiragana {

    public static String FtoJ(String s){
        s = s.toUpperCase();
        switch(s){

            case "A":
                return "あ";
            case "I":
                return "い";
            case "U":
                return "う";
            case "E":
                return "え";
            case "O":
                return "お";
            case "KA":
                return "か";
            case "KI":
                return "き";
            case "KU":
                return "く";
            case "KE":
                return "け";
            case "KO":
                return "こ";
            case "SA":
                return "さ";
            case "SHI":
                return "し";
            case "SU":
                return "す";
            case "SE":
                return "せ";
            case "SO":
                return "そ";
            case "TA":
                return "た";
            case "CHI":
                return "ち";
            case "TSU":
                return "つ";
            case "TE":
                return "て";
            case "TO":
                return "と";
            case "NA":
                return "な";
            case "NI":
                return "に";
            case "NU":
                return "ぬ";
            case "NE":
                return "ね";
            case "NO":
                return "の";
            case "HA":
                return "は";
            case "HI":
                return "ひ";
            case "FU":
                return "ふ";
            case "HE":
                return "へ";
            case "HO":
                return "ほ";
            case "MA":
                return "ま";
            case "MI":
                return "み";
            case "MU":
                return "む";
            case "ME":
                return "め";
            case "MO":
                return "も";
            case "YA":
                return "や";
            case "YU":
                return "ゆ";
            case "YO":
                return "よ";
            case "RA":
                return "ら";
            case "RI":
                return "り";
            case "RU":
                return "る";
            case "RE":
                return "れ";
            case "RO":
                return "ろ";
            case "WA":
                return "わ";
            case "WO":
                return "を";
            case "N":
                return "ん";

            case "null":
                return " ";

            default:
                return "Error: (Hiragana, FtoJ, "+ s +")";
        }
    }

    public static String JtoF(String s){

        switch(s){

            case "あ":
                return "A";
            case "い":
                return "I";
            case "う":
                return "U";
            case "え":
                return "E";
            case "お":
                return "O";
            case "か":
                return "KA";
            case "き":
                return "KI";
            case "く":
                return "KU";
            case "け":
                return "KE";
            case "こ":
                return "KO";
            case "さ":
                return "SA";
            case "し":
                return "SHI";
            case "す":
                return "SU";
            case "せ":
                return "SE";
            case "そ":
                return "SO";
            case "た":
                return "TA";
            case "ち":
                return "CHI";
            case "つ":
                return "TSU";
            case "て":
                return "TE";
            case "と":
                return "TO";
            case "な":
                return "NA";
            case "に":
                return "NI";
            case "ぬ":
                return "NU";
            case "ね":
                return "NE";
            case "の":
                return "NO";
            case "は":
                return "HA";
            case "ひ":
                return "HI";
            case "ふ":
                return "FU";
            case "へ":
                return "HE";
            case "ほ":
                return "HO";
            case "ま":
                return "MA";
            case "み":
                return "MI";
            case "む":
                return "MU";
            case "め":
                return "ME";
            case "も":
                return "MO";
            case "や":
                return "YA";
            case "ゆ":
                return "YU";
            case "よ":
                return "YO";
            case "ら":
                return "RA";
            case "り":
                return "RI";
            case "る":
                return "RU";
            case "れ":
                return "RE";
            case "ろ":
                return "RO";
            case "わ":
                return "WA";
            case "を":
                return "WO";
            case "ん":
                return "N";

            case "null":
                return " ";

            default:
                return "Error: (Hiragana, JtoF, " + s + ")";
        }
    }
}
