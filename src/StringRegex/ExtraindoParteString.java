package StringRegex;

public class ExtraindoParteString {
    public static void main(String[] args) {
        //Objetivo: Extrair o nome do arquivo sem a extensão
        String string = "relatorio_final.pdf";
        //substring(início - o caractere dessa posição é adicionada na string final,
        //fim - o caractere dessa posição é excluída da string final)
        //lastIndexOf(retorna o índice da última ocorrência encontrada)
        System.out.println(string.substring(0,string.lastIndexOf(".")));
    }
}
