package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Imagem extends AbstractSankhyaEntity<Imagem> {
   private BigDecimal codImg;
   private byte[] foto;

   public BigDecimal getCodImg() {
        return codImg;
   }

   public void setCodImg(BigDecimal codImg) {
        markAsChanged("CODIMG", codImg);
        this.codImg = codImg;
   }

   public byte[] getFoto() {
        return foto;
   }

   public void setFoto(byte[] foto) {
        markAsChanged("FOTO", foto);
        this.foto = foto;
   }

   @Override
   public String getTableName() {
        return "TSIIMG";
   }

   @Override
   public String getEntityName() {
        return "Imagem";
   }

   @Override
   public Imagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codImg = vo.asBigDecimal("CODIMG");
        this.foto = vo.asBlob("FOTO");
        return this;
   }
}
