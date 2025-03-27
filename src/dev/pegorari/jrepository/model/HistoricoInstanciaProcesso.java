package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoInstanciaProcesso extends AbstractSankhyaEntity<HistoricoInstanciaProcesso> {
   public Timestamp getDhExecucao() {
        return this.getVo().asTimestamp("DHEXECUCAO");
   }

   public void setDhExecucao(Timestamp dhExecucao) {
        markAsChanged("DHEXECUCAO", dhExecucao);
   }

   public String getIdElemento() {
        return this.getVo().asString("IDELEMENTO");
   }

   public void setIdElemento(String idElemento) {
        markAsChanged("IDELEMENTO", idElemento);
   }

   public BigDecimal getIdInstEle() {
        return this.getVo().asBigDecimal("IDINSTELE");
   }

   public void setIdInstEle(BigDecimal idInstEle) {
        markAsChanged("IDINSTELE", idInstEle);
   }

   public BigDecimal getIdInstPrn() {
        return this.getVo().asBigDecimal("IDINSTPRN");
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        markAsChanged("IDINSTPRN", idInstPrn);
   }

   public String getResumo() {
        return this.getVo().asString("RESUMO");
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public BigDecimal getTempoExecucao() {
        return this.getVo().asBigDecimal("TEMPOEXECUCAO");
   }

   public void setTempoExecucao(BigDecimal tempoExecucao) {
        markAsChanged("TEMPOEXECUCAO", tempoExecucao);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TWFIHIS";
   }

   @Override
   public String getEntityName() {
        return "HistoricoInstanciaProcesso";
   }

   @Override
   public HistoricoInstanciaProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
