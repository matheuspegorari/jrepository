package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EnderecoAreaConf extends AbstractSankhyaEntity<EnderecoAreaConf> {
   public BigDecimal getCodEndFim() {
        return this.getVo().asBigDecimal("CODENDFIM");
   }

   public void setCodEndFim(BigDecimal codEndFim) {
        markAsChanged("CODENDFIM", codEndFim);
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

   public BigDecimal getCodEndIni() {
        return this.getVo().asBigDecimal("CODENDINI");
   }

   public void setCodEndIni(BigDecimal codEndIni) {
        markAsChanged("CODENDINI", codEndIni);
   }

   public BigDecimal getCodAreaConf() {
        return this.getVo().asBigDecimal("CODAREACONF");
   }

   public void setCodAreaConf(BigDecimal codAreaConf) {
        markAsChanged("CODAREACONF", codAreaConf);
   }

   @Override
   public String getTableName() {
        return "TGWEAC";
   }

   @Override
   public String getEntityName() {
        return "EnderecoAreaConf";
   }

   @Override
   public EnderecoAreaConf fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
