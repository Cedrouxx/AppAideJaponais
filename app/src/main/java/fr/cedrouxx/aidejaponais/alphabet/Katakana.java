package fr.cedrouxx.aidejaponais.alphabet;

public class Katakana {

    public static String FtoJ(String s){
        s = s.toUpperCase();
        switch(s){

            case "A":
                return "ア";
            case "I":
                return "イ";
            case "U":
                return "ウ";
            case "E":
                return "エ";
            case "O":
                return "オ";
            case "KA":
                return "カ";
            case "KI":
                return "キ";
            case "KU":
                return "ク";
            case "KE":
                return "ケ";
            case "KO":
                return "コ";
            case "SA":
                return "サ";
            case "SHI":
                return "シ";
            case "SU":
                return "ス";
            case "SE":
                return "セ";
            case "SO":
                return "ソ";
            case "TA":
                return "タ";
            case "CHI":
                return "チ";
            case "TSU":
                return "ツ";
            case "TE":
                return "テ";
            case "TO":
                return "ト";
            case "NA":
                return "ナ";
            case "NI":
                return "ニ";
            case "NU":
                return "ヌ";
            case "NE":
                return "ネ";
            case "NO":
                return "ノ";
            case "HA":
                return "ハ";
            case "HI":
                return "ヒ";
            case "FU":
                return "フ";
            case "HE":
                return "ヘ";
            case "HO":
                return "ホ";
            case "MA":
                return "マ";
            case "MI":
                return "ミ";
            case "MU":
                return "ム";
            case "ME":
                return "メ";
            case "MO":
                return "モ";
            case "YA":
                return "ヤ";
            case "YU":
                return "ユ";
            case "YO":
                return "ヨ";
            case "RA":
                return "ラ";
            case "RI":
                return "リ";
            case "RU":
                return "ル";
            case "RE":
                return "レ";
            case "RO":
                return "ロ";
            case "WA":
                return "ワ";
            case "WO":
                return "ヲ";
            case "N":
                return "ン";

            case "null":
                return " ";

            default:
                return "Error: (Katakana, FtoJ" + s +")";
        }
    }

    public static String JtoF(String s){

        switch(s){

            case "ア":
                return "A";
            case "イ":
                return "I";
            case "ウ":
                return "U";
            case "エ":
                return "E";
            case "オ":
                return "O";
            case "カ":
                return "KA";
            case "キ":
                return "KI";
            case "ク":
                return "KU";
            case "ケ":
                return "KE";
            case "コ":
                return "KO";
            case "サ":
                return "SA";
            case "シ":
                return "SHI";
            case "ス":
                return "SU";
            case "セ":
                return "SE";
            case "ソ":
                return "SO";
            case "タ":
                return "TA";
            case "チ":
                return "CHI";
            case "ツ":
                return "TSU";
            case "テ":
                return "TE";
            case "ト":
                return "TO";
            case "ナ":
                return "NA";
            case "ニ":
                return "NI";
            case "ヌ":
                return "NU";
            case "ネ":
                return "NE";
            case "ノ":
                return "NO";
            case "ハ":
                return "HA";
            case "ヒ":
                return "HI";
            case "フ":
                return "FU";
            case "ヘ":
                return "HE";
            case "ホ":
                return "HO";
            case "マ":
                return "MA";
            case "ミ":
                return "MI";
            case "ム":
                return "MU";
            case "メ":
                return "ME";
            case "も":
                return "MO";
            case "ヤ":
                return "YA";
            case "ユ":
                return "YU";
            case "ヨ":
                return "YO";
            case "ラ":
                return "RA";
            case "リ":
                return "RI";
            case "ル":
                return "RU";
            case "レ":
                return "RE";
            case "ロ":
                return "RO";
            case "ワ":
                return "WA";
            case "ヲ":
                return "WO";
            case "ン":
                return "N";

            case "null":
                return " ";

            default:
                return "Error: (Katakana, JtoF,"+ s +")";
        }
    }
}
