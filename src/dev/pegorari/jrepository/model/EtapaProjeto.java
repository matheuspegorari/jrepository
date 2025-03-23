package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapaProjeto extends AbstractSankhyaEntity<EtapaProjeto> {
   private BigDecimal chaveImp;
   private BigDecimal codProd;
   private String concluida;
   private String conclusaoAutomatica;
   private String descricao;
   private Timestamp dtCedOfImpPrev;
   private Timestamp dtCedOiNiPrev;
   private Timestamp dtTarDefImpPrev;
   private Timestamp dtTarDeiNiPrev;
   private String exigeReq;
   private BigDecimal nuFap;
   private BigDecimal numEtapa;
   private BigDecimal numEtapaPai;
   private BigDecimal numSeq;
   private String observacao;
   private String suplementa;
   private String suplementado;
   private String tipValor;
   private BigDecimal valor;
   private BigDecimal vlrSuplementa;
   private BigDecimal vlrSuplementado;
   private BigDecimal vlrSuplementadoRea;
   private BigDecimal vlrSuplementaRea;
   private BigDecimal numModelo;

   public BigDecimal getChaveImp() {
        return chaveImp;
   }

   public void setChaveImp(BigDecimal chaveImp) {
        markAsChanged("CHAVEIMP", chaveImp);
        this.chaveImp = chaveImp;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getConcluida() {
        return concluida;
   }

   public void setConcluida(String concluida) {
        markAsChanged("CONCLUIDA", concluida);
        this.concluida = concluida;
   }

   public String getConclusaoAutomatica() {
        return conclusaoAutomatica;
   }

   public void setConclusaoAutomatica(String conclusaoAutomatica) {
        markAsChanged("CONCLUSAOAUTOMATICA", conclusaoAutomatica);
        this.conclusaoAutomatica = conclusaoAutomatica;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public Timestamp getDtCedOfImpPrev() {
        return dtCedOfImpPrev;
   }

   public void setDtCedOfImpPrev(Timestamp dtCedOfImpPrev) {
        markAsChanged("DTCEDOFIMPREV", dtCedOfImpPrev);
        this.dtCedOfImpPrev = dtCedOfImpPrev;
   }

   public Timestamp getDtCedOiNiPrev() {
        return dtCedOiNiPrev;
   }

   public void setDtCedOiNiPrev(Timestamp dtCedOiNiPrev) {
        markAsChanged("DTCEDOINIPREV", dtCedOiNiPrev);
        this.dtCedOiNiPrev = dtCedOiNiPrev;
   }

   public Timestamp getDtTarDefImpPrev() {
        return dtTarDefImpPrev;
   }

   public void setDtTarDefImpPrev(Timestamp dtTarDefImpPrev) {
        markAsChanged("DTTARDEFIMPREV", dtTarDefImpPrev);
        this.dtTarDefImpPrev = dtTarDefImpPrev;
   }

   public Timestamp getDtTarDeiNiPrev() {
        return dtTarDeiNiPrev;
   }

   public void setDtTarDeiNiPrev(Timestamp dtTarDeiNiPrev) {
        markAsChanged("DTTARDEINIPREV", dtTarDeiNiPrev);
        this.dtTarDeiNiPrev = dtTarDeiNiPrev;
   }

   public String getExigeReq() {
        return exigeReq;
   }

   public void setExigeReq(String exigeReq) {
        markAsChanged("EXIGEREQ", exigeReq);
        this.exigeReq = exigeReq;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
        this.nuFap = nuFap;
   }

   public BigDecimal getNumEtapa() {
        return numEtapa;
   }

   public void setNumEtapa(BigDecimal numEtapa) {
        markAsChanged("NUMETAPA", numEtapa);
        this.numEtapa = numEtapa;
   }

   public BigDecimal getNumEtapaPai() {
        return numEtapaPai;
   }

   public void setNumEtapaPai(BigDecimal numEtapaPai) {
        markAsChanged("NUMETAPAPAI", numEtapaPai);
        this.numEtapaPai = numEtapaPai;
   }

   public BigDecimal getNumSeq() {
        return numSeq;
   }

   public void setNumSeq(BigDecimal numSeq) {
        markAsChanged("NUMSEQ", numSeq);
        this.numSeq = numSeq;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public String getSuplementa() {
        return suplementa;
   }

   public void setSuplementa(String suplementa) {
        markAsChanged("SUPLEMENTA", suplementa);
        this.suplementa = suplementa;
   }

   public String getSuplementado() {
        return suplementado;
   }

   public void setSuplementado(String suplementado) {
        markAsChanged("SUPLEMENTADO", suplementado);
        this.suplementado = suplementado;
   }

   public String getTipValor() {
        return tipValor;
   }

   public void setTipValor(String tipValor) {
        markAsChanged("TIPVALOR", tipValor);
        this.tipValor = tipValor;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public BigDecimal getVlrSuplementa() {
        return vlrSuplementa;
   }

   public void setVlrSuplementa(BigDecimal vlrSuplementa) {
        markAsChanged("VLRSUPLEMENTA", vlrSuplementa);
        this.vlrSuplementa = vlrSuplementa;
   }

   public BigDecimal getVlrSuplementado() {
        return vlrSuplementado;
   }

   public void setVlrSuplementado(BigDecimal vlrSuplementado) {
        markAsChanged("VLRSUPLEMENTADO", vlrSuplementado);
        this.vlrSuplementado = vlrSuplementado;
   }

   public BigDecimal getVlrSuplementadoRea() {
        return vlrSuplementadoRea;
   }

   public void setVlrSuplementadoRea(BigDecimal vlrSuplementadoRea) {
        markAsChanged("VLRSUPLEMENTADOREA", vlrSuplementadoRea);
        this.vlrSuplementadoRea = vlrSuplementadoRea;
   }

   public BigDecimal getVlrSuplementaRea() {
        return vlrSuplementaRea;
   }

   public void setVlrSuplementaRea(BigDecimal vlrSuplementaRea) {
        markAsChanged("VLRSUPLEMENTAREA", vlrSuplementaRea);
        this.vlrSuplementaRea = vlrSuplementaRea;
   }

   public BigDecimal getNumModelo() {
        return numModelo;
   }

   public void setNumModelo(BigDecimal numModelo) {
        markAsChanged("NUMMODELO", numModelo);
        this.numModelo = numModelo;
   }

   @Override
   public String getTableName() {
        return "TCSFET";
   }

   @Override
   public String getEntityName() {
        return "EtapaProjeto";
   }

   @Override
   public EtapaProjeto fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.chaveImp = vo.asBigDecimal("CHAVEIMP");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.concluida = vo.asString("CONCLUIDA");
        this.conclusaoAutomatica = vo.asString("CONCLUSAOAUTOMATICA");
        this.descricao = vo.asString("DESCRICAO");
        this.dtCedOfImpPrev = vo.asTimestamp("DTCEDOFIMPREV");
        this.dtCedOiNiPrev = vo.asTimestamp("DTCEDOINIPREV");
        this.dtTarDefImpPrev = vo.asTimestamp("DTTARDEFIMPREV");
        this.dtTarDeiNiPrev = vo.asTimestamp("DTTARDEINIPREV");
        this.exigeReq = vo.asString("EXIGEREQ");
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.numEtapa = vo.asBigDecimal("NUMETAPA");
        this.numEtapaPai = vo.asBigDecimal("NUMETAPAPAI");
        this.numSeq = vo.asBigDecimal("NUMSEQ");
        this.observacao = vo.asString("OBSERVACAO");
        this.suplementa = vo.asString("SUPLEMENTA");
        this.suplementado = vo.asString("SUPLEMENTADO");
        this.tipValor = vo.asString("TIPVALOR");
        this.valor = vo.asBigDecimal("VALOR");
        this.vlrSuplementa = vo.asBigDecimal("VLRSUPLEMENTA");
        this.vlrSuplementado = vo.asBigDecimal("VLRSUPLEMENTADO");
        this.vlrSuplementadoRea = vo.asBigDecimal("VLRSUPLEMENTADOREA");
        this.vlrSuplementaRea = vo.asBigDecimal("VLRSUPLEMENTAREA");
        this.numModelo = vo.asBigDecimal("NUMMODELO");
        return this;
   }
}
