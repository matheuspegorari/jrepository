package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EFDContribuicoes extends AbstractSankhyaEntity<EFDContribuicoes> {
   public String getArqConfirmado() {
        return this.getVo().asString("ARQCONFIRMADO");
   }

   public void setArqConfirmado(String arqConfirmado) {
        markAsChanged("ARQCONFIRMADO", arqConfirmado);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getVersaoLayout() {
        return this.getVo().asBigDecimal("VERSAOLAYOUT");
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
   }

   public char[] getConfig() {
        return this.getVo().asClob("CONFIG");
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
   }

   public BigDecimal getTipoEscritCsll() {
        return this.getVo().asBigDecimal("TIPO_ESCRIT_CSLL");
   }

   public void setTipoEscritCsll(BigDecimal tipoEscritCsll) {
        markAsChanged("TIPO_ESCRIT_CSLL", tipoEscritCsll);
   }

   @Override
   public String getTableName() {
        return "TGFEFDC";
   }

   @Override
   public String getEntityName() {
        return "EFDContribuicoes";
   }

   @Override
   public EFDContribuicoes fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
