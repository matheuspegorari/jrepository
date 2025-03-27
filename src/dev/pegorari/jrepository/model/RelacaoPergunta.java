package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RelacaoPergunta extends AbstractSankhyaEntity<RelacaoPergunta> {
   public BigDecimal getCodPergDep() {
        return this.getVo().asBigDecimal("CODPERGDEP");
   }

   public void setCodPergDep(BigDecimal codPergDep) {
        markAsChanged("CODPERGDEP", codPergDep);
   }

   public BigDecimal getCodPergMestre() {
        return this.getVo().asBigDecimal("CODPERGMESTRE");
   }

   public void setCodPergMestre(BigDecimal codPergMestre) {
        markAsChanged("CODPERGMESTRE", codPergMestre);
   }

   public BigDecimal getCodRespMestre() {
        return this.getVo().asBigDecimal("CODRESPMESTRE");
   }

   public void setCodRespMestre(BigDecimal codRespMestre) {
        markAsChanged("CODRESPMESTRE", codRespMestre);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   @Override
   public String getTableName() {
        return "TPQDPD";
   }

   @Override
   public String getEntityName() {
        return "RelacaoPergunta";
   }

   @Override
   public RelacaoPergunta fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
