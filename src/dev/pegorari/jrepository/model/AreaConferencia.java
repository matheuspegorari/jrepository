package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AreaConferencia extends AbstractSankhyaEntity<AreaConferencia> {
   public String getImpSep() {
        return this.getVo().asString("IMPSEP");
   }

   public void setImpSep(String impSep) {
        markAsChanged("IMPSEP", impSep);
   }

   public BigDecimal getCodAreaConf() {
        return this.getVo().asBigDecimal("CODAREACONF");
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        markAsChanged("CODAREACONF", codAreaConf);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getNomeAreaConf() {
        return this.getVo().asString("NOMEAREACONF");
   }

   public void setNomeAreaConf(String nomeAreaConf) {
        markAsChanged("NOMEAREACONF", nomeAreaConf);
   }

   @Override
   public String getTableName() {
        return "TGWARC";
   }

   @Override
   public String getEntityName() {
        return "AreaConferencia";
   }

   @Override
   public AreaConferencia fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
