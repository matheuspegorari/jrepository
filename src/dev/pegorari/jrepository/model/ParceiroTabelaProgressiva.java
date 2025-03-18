package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ParceiroTabelaProgressiva extends AbstractSankhyaEntity<ParceiroTabelaProgressiva> {
   private BigDecimal codParc;
   private BigDecimal codProd;
   private Timestamp competencia;
   private BigDecimal dependente;
   private String tem13;
   private String retemInssOrigFin;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public Timestamp getCompetencia() {
        return competencia;
   }

   public void setCompetencia(Timestamp competencia) {
        markAsChanged("COMPETENCIA", competencia);
        this.competencia = competencia;
   }

   public BigDecimal getDependente() {
        return dependente;
   }

   public void setDependente(BigDecimal dependente) {
        markAsChanged("DEPENDENTE", dependente);
        this.dependente = dependente;
   }

   public String getTem13() {
        return tem13;
   }

   public void setTem13(String tem13) {
        markAsChanged("TEM13", tem13);
        this.tem13 = tem13;
   }

   public String getRetemInssOrigFin() {
        return retemInssOrigFin;
   }

   public void setRetemInssOrigFin(String retemInssOrigFin) {
        markAsChanged("RETEMINSSORIGFIN", retemInssOrigFin);
        this.retemInssOrigFin = retemInssOrigFin;
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
        this.setOriginalVO(vo);
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.competencia = vo.asTimestamp("COMPETENCIA");
        this.dependente = vo.asBigDecimal("DEPENDENTE");
        this.tem13 = vo.asString("TEM13");
        this.retemInssOrigFin = vo.asString("RETEMINSSORIGFIN");
        return this;
   }
}
