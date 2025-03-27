package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParceiroTabelaProgressiva extends AbstractSankhyaEntity<ParceiroTabelaProgressiva> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getCompetencia() {
        return this.getVo().asTimestamp("COMPETENCIA");
   }

   public void setCompetencia(Timestamp competencia) {
        markAsChanged("COMPETENCIA", competencia);
   }

   public BigDecimal getDependente() {
        return this.getVo().asBigDecimal("DEPENDENTE");
   }

   public void setDependente(BigDecimal dependente) {
        markAsChanged("DEPENDENTE", dependente);
   }

   public String getTem13() {
        return this.getVo().asString("TEM13");
   }

   public void setTem13(String tem13) {
        markAsChanged("TEM13", tem13);
   }

   public String getRetemInssOrigFin() {
        return this.getVo().asString("RETEMINSSORIGFIN");
   }

   public void setRetemInssOrigFin(String retemInssOrigFin) {
        markAsChanged("RETEMINSSORIGFIN", retemInssOrigFin);
   }

   @Override
   public String getTableName() {
        return "TGFPTP";
   }

   @Override
   public String getEntityName() {
        return "ParceiroTabelaProgressiva";
   }

   @Override
   public ParceiroTabelaProgressiva fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
