package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Dirf extends AbstractSankhyaEntity<Dirf> {
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

   public Timestamp getDtFinal() {
        return this.getVo().asTimestamp("DTFINAL");
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
   }

   public Timestamp getDtInicial() {
        return this.getVo().asTimestamp("DTINICIAL");
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
   }

   public String getIdEstLeiaute() {
        return this.getVo().asString("IDESTLEIAUTE");
   }

   public void setIdEstLeiaute(String idEstLeiaute) {
        markAsChanged("IDESTLEIAUTE", idEstLeiaute);
   }

   public String getNumRecibo() {
        return this.getVo().asString("NUMRECIBO");
   }

   public void setNumRecibo(String numRecibo) {
        markAsChanged("NUMRECIBO", numRecibo);
   }

   public String getTipDeclaracao() {
        return this.getVo().asString("TIPDECLARACAO");
   }

   public void setTipDeclaracao(String tipDeclaracao) {
        markAsChanged("TIPDECLARACAO", tipDeclaracao);
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
        this.setVo(vo);
        return this;
   }
}
