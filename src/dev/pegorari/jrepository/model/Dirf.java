package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Dirf extends AbstractSankhyaEntity<Dirf> {
   private String arqConfirmado;
   private BigDecimal codEmp;
   private Timestamp dtFinal;
   private Timestamp dtInicial;
   private String idEstLeiaute;
   private String numRecibo;
   private String tipDeclaracao;

   public String getArqConfirmado() {
        return arqConfirmado;
   }

   public void setArqConfirmado(String arqConfirmado) {
        this.arqConfirmado = arqConfirmado;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        this.dtFinal = dtFinal;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        this.dtInicial = dtInicial;
   }

   public String getIdEstLeiaute() {
        return idEstLeiaute;
   }

   public void setIdEstLeiaute(String idEstLeiaute) {
        this.idEstLeiaute = idEstLeiaute;
   }

   public String getNumRecibo() {
        return numRecibo;
   }

   public void setNumRecibo(String numRecibo) {
        this.numRecibo = numRecibo;
   }

   public String getTipDeclaracao() {
        return tipDeclaracao;
   }

   public void setTipDeclaracao(String tipDeclaracao) {
        this.tipDeclaracao = tipDeclaracao;
   }

   @Override
   public String getTableName() {
        return "TGFDIRF";
   }

   @Override
   public String getEntityName() {
        return "Dirf";
   }

   @Override
   public Dirf fromVO(DynamicVO vo) {
        this.arqConfirmado = vo.asString("ARQCONFIRMADO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.idEstLeiaute = vo.asString("IDESTLEIAUTE");
        this.numRecibo = vo.asString("NUMRECIBO");
        this.tipDeclaracao = vo.asString("TIPDECLARACAO");
        return this;
   }
}
