public class Cifrado {
    Operaciones op=new Operaciones();
    public  String cifrar(String cadena){
        char[] caracteresChar;
        int tam;
        caracteresChar=cadena.toCharArray();
        tam=caracteresChar.length;
        int[] caracteresInt = new int[tam];
        String cifrado;
        for(int i=0;i<caracteresChar.length;i++){
            caracteresInt[i]=(int)(caracteresChar[i]+13);
        }
        cifrado=op.intAChar(caracteresInt);
        return cifrado;
    }

    public String descifrar(String cadena){
        char[] caracteresChar;
        int tam;
        caracteresChar=cadena.toCharArray();
        tam=caracteresChar.length;
        int[] caracteresInt = new int[tam];

        String descifrado;
        for(int i=0;i<caracteresChar.length;i++){
            caracteresInt[i]=(int)(caracteresChar[i]-13);
        }
        descifrado=op.intAChar(caracteresInt);
        return descifrado;
    }


    private class Operaciones{
        public String intAChar(int[]caracteresI){

            int tam=caracteresI.length;
            char[] caracteresC= new char[tam];
            for(int i=0;i<caracteresI.length;i++){
                caracteresC[i]=(char) (caracteresI[i]);
            }
            String string = String.valueOf(caracteresC);
            return string;
        }

    }




}
