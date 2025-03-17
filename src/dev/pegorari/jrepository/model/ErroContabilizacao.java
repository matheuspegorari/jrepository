package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ErroContabilizacao extends AbstractSankhyaEntity<ErroContabilizacao> {
   private BigDecimal codTipOper;
   private String contabilizado;
   private String descricao;
   private Timestamp dhCtz;
   private BigDecimal nuAgendCtz;
   private BigDecimal nuNico;
   private BigDecimal nuSeqErr;
   private String origem;
   private BigDecimal seqCtb;
   private String tipLanc;
   private String tipo;

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public String getContabilizado() {
        return contabilizado;
   }

   public void setContabilizado(String contabilizado) {
        this.contabilizado = contabilizado;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public Timestamp getDhCtz() {
        return dhCtz;
   }

   public void setDhCtz(Timestamp dhCtz) {
        this.dhCtz = dhCtz;
   }

   public BigDecimal getNuAgendCtz() {
        return nuAgendCtz;
   }

   public void setNuAgendCtz(BigDecimal nuAgendCtz) {
        this.nuAgendCtz = nuAgendCtz;
   }

   public BigDecimal getNuNico() {
        return nuNico;
   }

   public void setNuNico(BigDecimal nuNico) {
        this.nuNico = nuNico;
   }

   public BigDecimal getNuSeqErr() {
        return nuSeqErr;
   }

   public void setNuSeqErr(BigDecimal nuSeqErr) {
        this.nuSeqErr = nuSeqErr;
   }

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        this.origem = origem;
   }

   public BigDecimal getSeqCtb() {
        return seqCtb;
   }

   public void setSeqCtb(BigDecimal seqCtb) {
        this.seqCtb = seqCtb;
   }

   public String getTipLanc() {
        return tipLanc;
   }

   public void setTipLanc(String tipLanc) {
        this.tipLanc = tipLanc;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TCBERR";
   }

   @Override
   public String getEntityName() {
        return "ErroContabilizacao";
   }

   @Override
   public ErroContabilizacao fromVO(DynamicVO vo) {
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.contabilizado = vo.asString("CONTABILIZADO");
        this.descricao = vo.asString("DESCRICAO");
        this.dhCtz = vo.asTimestamp("DHCTZ");
        this.nuAgendCtz = vo.asBigDecimal("NUAGENDCTZ");
        this.nuNico = vo.asBigDecimal("NUNICO");
        this.nuSeqErr = vo.asBigDecimal("NUSEQERR");
        this.origem = vo.asString("ORIGEM");
        this.seqCtb = vo.asBigDecimal("SEQCTB");
        this.tipLanc = vo.asString("TIPLANC");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
