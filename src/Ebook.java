public class Ebook extends Livro implements Promocional{


        private String waterMark;

        public Ebook(Autor autor){
            super(autor);
        }


        public void setWaterMark(String waterMark){
           this.waterMark = waterMark;
        }

        public String getWaterMark(){
            return waterMark;
        }
        @Override
        public boolean aplicaDescontoDe(double porcentagem){
            if(porcentagem > 0.15){
                return false;
            }

            this.valor -= this.valor * porcentagem;
            return true;
        }


}
