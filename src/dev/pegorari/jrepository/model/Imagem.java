package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class Imagem implements SankhyaEntity<Imagem> {

   private BigDecimal codImg;
   private byte[] foto;

   public BigDecimal getCodImg() {
        return codImg;
   }

   public void setCodImg(BigDecimal codImg) {
        this.codImg = codImg;
   }

   public byte[] getFoto() {
        return foto;
   }

   public void setFoto(byte[] foto) {
        this.foto = foto;
   }

   @Override
   public String getEntityName() {
        return "Imagem";
   }

   @Override
   public Imagem fromVO(DynamicVO vo) {
        this.codImg = vo.asBigDecimal("CODIMG");
        this.foto = vo.asBlob("FOTO");
        return this;
   }
}
