package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Imagem extends AbstractSankhyaEntity<Imagem> {
   public BigDecimal getCodImg() {
        return this.getVo().asBigDecimal("CODIMG");
   }

   public void setCodImg(BigDecimal codImg) {
        markAsChanged("CODIMG", codImg);
   }

   public byte[] getFoto() {
        return this.getVo().asBlob("FOTO");
   }

   public void setFoto(byte[] foto) {
        markAsChanged("FOTO", foto);
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
        return this;
   }
}
