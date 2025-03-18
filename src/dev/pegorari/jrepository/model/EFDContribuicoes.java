package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EFDContribuicoes extends AbstractSankhyaEntity<EFDContribuicoes> {
   private String arqConfirmado;
   private BigDecimal codEmp;
   private Timestamp dtRef;
   private BigDecimal versaoLayout;
   private char[] config;
   private BigDecimal tipoEscritCsll;

   public String getArqConfirmado() {
        return arqConfirmado;
   }

   public void setArqConfirmado(String arqConfirmado) {
        markAsChanged("ARQCONFIRMADO", arqConfirmado);
        this.arqConfirmado = arqConfirmado;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
        this.dtRef = dtRef;
   }

   public BigDecimal getVersaoLayout() {
        return versaoLayout;
   }

   public void setVersaoLayout(BigDecimal versaoLayout) {
        markAsChanged("VERSAOLAYOUT", versaoLayout);
        this.versaoLayout = versaoLayout;
   }

   public char[] getConfig() {
        return config;
   }

   public void setConfig(char[] config) {
        markAsChanged("CONFIG", config);
        this.config = config;
   }

   public BigDecimal getTipoEscritCsll() {
        return tipoEscritCsll;
   }

   public void setTipoEscritCsll(BigDecimal tipoEscritCsll) {
        markAsChanged("TIPO_ESCRIT_CSLL", tipoEscritCsll);
        this.tipoEscritCsll = tipoEscritCsll;
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
        this.setOriginalVO(vo);
        this.arqConfirmado = vo.asString("ARQCONFIRMADO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtRef = vo.asTimestamp("DTREF");
        this.versaoLayout = vo.asBigDecimal("VERSAOLAYOUT");
        this.config = vo.asClob("CONFIG");
        this.tipoEscritCsll = vo.asBigDecimal("TIPO_ESCRIT_CSLL");
        return this;
   }
}
