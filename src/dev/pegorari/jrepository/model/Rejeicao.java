package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Rejeicao extends AbstractSankhyaEntity<Rejeicao> {
   public BigDecimal getCodigo() {
        return this.getVo().asBigDecimal("CODIGO");
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public String getCodOcorrencia() {
        return this.getVo().asString("CODOCORRENCIA");
   }

   public void setCodOcorrencia(String codOcorrencia) {
        markAsChanged("CODOCORRENCIA", codOcorrencia);
   }

   public String getCodRej() {
        return this.getVo().asString("CODREJ");
   }

   public void setCodRej(String codRej) {
        markAsChanged("CODREJ", codRej);
   }

   public String getDescrRej() {
        return this.getVo().asString("DESCRREJ");
   }

   public void setDescrRej(String descrRej) {
        markAsChanged("DESCRREJ", descrRej);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGFREJ";
   }

   @Override
   public String getEntityName() {
        return "Rejeicao";
   }

   @Override
   public Rejeicao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
