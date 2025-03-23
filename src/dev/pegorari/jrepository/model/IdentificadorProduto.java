package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class IdentificadorProduto extends AbstractSankhyaEntity<IdentificadorProduto> {
   private String identificador;
   private BigDecimal nuConf;
   private String nome;
   private BigDecimal seqId;
   private BigDecimal agrupamento;
   private BigDecimal seqConf;

   public String getIdentificador() {
        return identificador;
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
        this.identificador = identificador;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
        this.nuConf = nuConf;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public BigDecimal getSeqId() {
        return seqId;
   }

   public void setSeqId(BigDecimal seqId) {
        markAsChanged("SEQID", seqId);
        this.seqId = seqId;
   }

   public BigDecimal getAgrupamento() {
        return agrupamento;
   }

   public void setAgrupamento(BigDecimal agrupamento) {
        markAsChanged("AGRUPAMENTO", agrupamento);
        this.agrupamento = agrupamento;
   }

   public BigDecimal getSeqConf() {
        return seqConf;
   }

   public void setSeqConf(BigDecimal seqConf) {
        markAsChanged("SEQCONF", seqConf);
        this.seqConf = seqConf;
   }

   @Override
   public String getTableName() {
        return "TGFIDPC";
   }

   @Override
   public String getEntityName() {
        return "IdentificadorProduto";
   }

   @Override
   public IdentificadorProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.identificador = vo.asString("IDENTIFICADOR");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.nome = vo.asString("NOME");
        this.seqId = vo.asBigDecimal("SEQID");
        this.agrupamento = vo.asBigDecimal("AGRUPAMENTO");
        this.seqConf = vo.asBigDecimal("SEQCONF");
        return this;
   }
}
