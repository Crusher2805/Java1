    public static void main(String[] args)
            contieneLetra(String cadena, char letra) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                return true;
            }
        }
        return false;
    }
}
       
