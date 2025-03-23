package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Logradouro extends AbstractSankhyaEntity<Logradouro> {
   private String codLogradouro;
   private BigDecimal codUsu;
   private String descrLogradouro;
   private Timestamp dhAlter;

   public String getCodLogradouro() {
        return codLogradouro;
   }

   public void setCodLogradouro(String codLogradouro) {
        markAsChanged("CODLOGRADOURO", codLogradouro);
        this.codLogradouro = codLogradouro;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getDescrLogradouro() {
        return descrLogradouro;
   }

   public void setDescrLogradouro(String descrLogradouro) {
        markAsChanged("DESCRLOGRADOURO", descrLogradouro);
        this.descrLogradouro = descrLogradouro;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
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
        this.codLogradouro = vo.asString("CODLOGRADOURO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descrLogradouro = vo.asString("DESCRLOGRADOURO");
        this.dhAlter = vo.asTimestamp("DHALTER");
        return this;
   }
}
