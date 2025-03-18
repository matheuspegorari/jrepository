package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TransferenciaWMS extends AbstractSankhyaEntity<TransferenciaWMS> {
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private BigDecimal nuRecebimento;
   private BigDecimal nuTarefa;
   private BigDecimal nuTransferencia;
   private String situacao;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
        this.nuRecebimento = nuRecebimento;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getNuTransferencia() {
        return nuTransferencia;
   }

   public void setNuTransferencia(BigDecimal nuTransferencia) {
        markAsChanged("NUTRANSFERENCIA", nuTransferencia);
        this.nuTransferencia = nuTransferencia;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   @Override
   public String getTableName() {
        return "TGWTRA";
   }

   @Override
   public String getEntityName() {
        return "TransferenciaWMS";
   }

   @Override
   public TransferenciaWMS fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.nuTransferencia = vo.asBigDecimal("NUTRANSFERENCIA");
        this.situacao = vo.asString("SITUACAO");
        return this;
   }
}
