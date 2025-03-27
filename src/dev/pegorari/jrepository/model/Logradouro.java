package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Logradouro extends AbstractSankhyaEntity<Logradouro> {
   public String getCodLogradouro() {
        return this.getVo().asString("CODLOGRADOURO");
   }

   public void setCodLogradouro(String codLogradouro) {
        markAsChanged("CODLOGRADOURO", codLogradouro);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescrLogradouro() {
        return this.getVo().asString("DESCRLOGRADOURO");
   }

   public void setDescrLogradouro(String descrLogradouro) {
        markAsChanged("DESCRLOGRADOURO", descrLogradouro);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   @Override
   public String getTableName() {
        return "TFPLGR";
   }

   @Override
   public String getEntityName() {
        return "Logradouro";
   }

   @Override
   public Logradouro fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
