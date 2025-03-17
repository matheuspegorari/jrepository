package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RelacaoPergunta implements SankhyaEntity<RelacaoPergunta> {

   private BigDecimal codPergDep;
   private BigDecimal codPergMestre;
   private BigDecimal codRespMestre;
   private Timestamp dhAlter;
   private BigDecimal ordem;

   public BigDecimal getCodPergDep() {
        return codPergDep;
   }

   public void setCodPergDep(BigDecimal codPergDep) {
        this.codPergDep = codPergDep;
   }

   public BigDecimal getCodPergMestre() {
        return codPergMestre;
   }

   public void setCodPergMestre(BigDecimal codPergMestre) {
        this.codPergMestre = codPergMestre;
   }

   public BigDecimal getCodRespMestre() {
        return codRespMestre;
   }

   public void setCodRespMestre(BigDecimal codRespMestre) {
        this.codRespMestre = codRespMestre;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   @Override
   public String getEntityName() {
        return "RelacaoPergunta";
   }

   @Override
   public RelacaoPergunta fromVO(DynamicVO vo) {
        this.codPergDep = vo.asBigDecimal("CODPERGDEP");
        this.codPergMestre = vo.asBigDecimal("CODPERGMESTRE");
        this.codRespMestre = vo.asBigDecimal("CODRESPMESTRE");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.ordem = vo.asBigDecimal("ORDEM");
        return this;
   }
}
