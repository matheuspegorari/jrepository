package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentacaoCaixa extends AbstractSankhyaEntity<MovimentacaoCaixa> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNroUnico() {
        return this.getVo().asBigDecimal("NROUNICO");
   }

   public void setNroUnico(BigDecimal nroUnico) {
        markAsChanged("NROUNICO", nroUnico);
   }

   public BigDecimal getNuBco() {
        return this.getVo().asBigDecimal("NUBCO");
   }

   public void setNuBco(BigDecimal nuBco) {
        markAsChanged("NUBCO", nuBco);
   }

   public BigDecimal getNuCaixa() {
        return this.getVo().asBigDecimal("NUCAIXA");
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
   }

   public String getOrigem() {
        return this.getVo().asString("ORIGEM");
   }

   public void setOrigem(String origem) {
        markAsChanged("ORIGEM", origem);
   }

   public BigDecimal getRecDesp() {
        return this.getVo().asBigDecimal("RECDESP");
   }

   public void setRecDesp(BigDecimal recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public String getNumNsu() {
        return this.getVo().asString("NUMNSU");
   }

   public void setNumNsu(String numNsu) {
        markAsChanged("NUMNSU", numNsu);
   }

   @Override
   public String getTableName() {
        return "TGFMCX";
   }

   @Override
   public String getEntityName() {
        return "MovimentacaoCaixa";
   }

   @Override
   public MovimentacaoCaixa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
