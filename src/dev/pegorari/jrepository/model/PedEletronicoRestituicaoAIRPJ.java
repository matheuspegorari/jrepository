package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PedEletronicoRestituicaoAIRPJ implements SankhyaEntity<PedEletronicoRestituicaoAIRPJ> {

   private BigDecimal codDarf;
   private BigDecimal codEmp;
   private String numPerd;
   private Timestamp referencia;
   private Timestamp refOrigem;
   private String tipoImposto;
   private String tipPerdComp;
   private BigDecimal vlrPerdComp;

   public BigDecimal getCodDarf() {
        return codDarf;
   }

   public void setCodDarf(BigDecimal codDarf) {
        this.codDarf = codDarf;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getNumPerd() {
        return numPerd;
   }

   public void setNumPerd(String numPerd) {
        this.numPerd = numPerd;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public Timestamp getRefOrigem() {
        return refOrigem;
   }

   public void setRefOrigem(Timestamp refOrigem) {
        this.refOrigem = refOrigem;
   }

   public String getTipoImposto() {
        return tipoImposto;
   }

   public void setTipoImposto(String tipoImposto) {
        this.tipoImposto = tipoImposto;
   }

   public String getTipPerdComp() {
        return tipPerdComp;
   }

   public void setTipPerdComp(String tipPerdComp) {
        this.tipPerdComp = tipPerdComp;
   }

   public BigDecimal getVlrPerdComp() {
        return vlrPerdComp;
   }

   public void setVlrPerdComp(BigDecimal vlrPerdComp) {
        this.vlrPerdComp = vlrPerdComp;
   }

   @Override
   public String getEntityName() {
        return "PedEletronicoRestituicaoAIRPJ";
   }

   @Override
   public PedEletronicoRestituicaoAIRPJ fromVO(DynamicVO vo) {
        this.codDarf = vo.asBigDecimal("CODDARF");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.numPerd = vo.asString("NUMPERD");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.refOrigem = vo.asTimestamp("REFORIGEM");
        this.tipoImposto = vo.asString("TIPOIMPOSTO");
        this.tipPerdComp = vo.asString("TIPPERDCOMP");
        this.vlrPerdComp = vo.asBigDecimal("VLRPERDCOMP");
        return this;
   }
}
