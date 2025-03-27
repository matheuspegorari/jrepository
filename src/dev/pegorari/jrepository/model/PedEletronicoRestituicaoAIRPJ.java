package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PedEletronicoRestituicaoAIRPJ extends AbstractSankhyaEntity<PedEletronicoRestituicaoAIRPJ> {
   public BigDecimal getCodDarf() {
        return this.getVo().asBigDecimal("CODDARF");
   }

   public void setCodDarf(BigDecimal codDarf) {
        markAsChanged("CODDARF", codDarf);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getNumPerd() {
        return this.getVo().asString("NUMPERD");
   }

   public void setNumPerd(String numPerd) {
        markAsChanged("NUMPERD", numPerd);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public Timestamp getRefOrigem() {
        return this.getVo().asTimestamp("REFORIGEM");
   }

   public void setRefOrigem(Timestamp refOrigem) {
        markAsChanged("REFORIGEM", refOrigem);
   }

   public String getTipoImposto() {
        return this.getVo().asString("TIPOIMPOSTO");
   }

   public void setTipoImposto(String tipoImposto) {
        markAsChanged("TIPOIMPOSTO", tipoImposto);
   }

   public String getTipPerdComp() {
        return this.getVo().asString("TIPPERDCOMP");
   }

   public void setTipPerdComp(String tipPerdComp) {
        markAsChanged("TIPPERDCOMP", tipPerdComp);
   }

   public BigDecimal getVlrPerdComp() {
        return this.getVo().asBigDecimal("VLRPERDCOMP");
   }

   public void setVlrPerdComp(BigDecimal vlrPerdComp) {
        markAsChanged("VLRPERDCOMP", vlrPerdComp);
   }

   @Override
   public String getTableName() {
        return "TCBIRPJPCOMP";
   }

   @Override
   public String getEntityName() {
        return "PedEletronicoRestituicaoAIRPJ";
   }

   @Override
   public PedEletronicoRestituicaoAIRPJ fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
