package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoInstanciaProcesso extends AbstractSankhyaEntity<HistoricoInstanciaProcesso> {
   private Timestamp dhExecucao;
   private String idElemento;
   private BigDecimal idInstEle;
   private BigDecimal idInstPrn;
   private String resumo;
   private BigDecimal sequencia;
   private String status;
   private BigDecimal tempoExecucao;
   private String tipo;

   public Timestamp getDhExecucao() {
        return dhExecucao;
   }

   public void setDhExecucao(Timestamp dhExecucao) {
        markAsChanged("DHEXECUCAO", dhExecucao);
        this.dhExecucao = dhExecucao;
   }

   public String getIdElemento() {
        return idElemento;
   }

   public void setIdElemento(String idElemento) {
        markAsChanged("IDELEMENTO", idElemento);
        this.idElemento = idElemento;
   }

   public BigDecimal getIdInstEle() {
        return idInstEle;
   }

   public void setIdInstEle(BigDecimal idInstEle) {
        markAsChanged("IDINSTELE", idInstEle);
        this.idInstEle = idInstEle;
   }

   public BigDecimal getIdInstPrn() {
        return idInstPrn;
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        markAsChanged("IDINSTPRN", idInstPrn);
        this.idInstPrn = idInstPrn;
   }

   public String getResumo() {
        return resumo;
   }

   public void setResumo(String resumo) {
        markAsChanged("RESUMO", resumo);
        this.resumo = resumo;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public BigDecimal getTempoExecucao() {
        return tempoExecucao;
   }

   public void setTempoExecucao(BigDecimal tempoExecucao) {
        markAsChanged("TEMPOEXECUCAO", tempoExecucao);
        this.tempoExecucao = tempoExecucao;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
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
        this.dhExecucao = vo.asTimestamp("DHEXECUCAO");
        this.idElemento = vo.asString("IDELEMENTO");
        this.idInstEle = vo.asBigDecimal("IDINSTELE");
        this.idInstPrn = vo.asBigDecimal("IDINSTPRN");
        this.resumo = vo.asString("RESUMO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.status = vo.asString("STATUS");
        this.tempoExecucao = vo.asBigDecimal("TEMPOEXECUCAO");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
