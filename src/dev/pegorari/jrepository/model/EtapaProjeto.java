package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EtapaProjeto extends AbstractSankhyaEntity<EtapaProjeto> {
   public BigDecimal getChaveImp() {
        return this.getVo().asBigDecimal("CHAVEIMP");
   }

   public void setChaveImp(BigDecimal chaveImp) {
        markAsChanged("CHAVEIMP", chaveImp);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getConcluida() {
        return this.getVo().asString("CONCLUIDA");
   }

   public void setConcluida(String concluida) {
        markAsChanged("CONCLUIDA", concluida);
   }

   public String getConclusaoAutomatica() {
        return this.getVo().asString("CONCLUSAOAUTOMATICA");
   }

   public void setConclusaoAutomatica(String conclusaoAutomatica) {
        markAsChanged("CONCLUSAOAUTOMATICA", conclusaoAutomatica);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDtCedOfImpPrev() {
        return this.getVo().asTimestamp("DTCEDOFIMPREV");
   }

   public void setDtCedOfImpPrev(Timestamp dtCedOfImpPrev) {
        markAsChanged("DTCEDOFIMPREV", dtCedOfImpPrev);
   }

   public Timestamp getDtCedOiNiPrev() {
        return this.getVo().asTimestamp("DTCEDOINIPREV");
   }

   public void setDtCedOiNiPrev(Timestamp dtCedOiNiPrev) {
        markAsChanged("DTCEDOINIPREV", dtCedOiNiPrev);
   }

   public Timestamp getDtTarDefImpPrev() {
        return this.getVo().asTimestamp("DTTARDEFIMPREV");
   }

   public void setDtTarDefImpPrev(Timestamp dtTarDefImpPrev) {
        markAsChanged("DTTARDEFIMPREV", dtTarDefImpPrev);
   }

   public Timestamp getDtTarDeiNiPrev() {
        return this.getVo().asTimestamp("DTTARDEINIPREV");
   }

   public void setDtTarDeiNiPrev(Timestamp dtTarDeiNiPrev) {
        markAsChanged("DTTARDEINIPREV", dtTarDeiNiPrev);
   }

   public String getExigeReq() {
        return this.getVo().asString("EXIGEREQ");
   }

   public void setExigeReq(String exigeReq) {
        markAsChanged("EXIGEREQ", exigeReq);
   }

   public BigDecimal getNuFap() {
        return this.getVo().asBigDecimal("NUFAP");
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
   }

   public BigDecimal getNumEtapa() {
        return this.getVo().asBigDecimal("NUMETAPA");
   }

   public void setNumEtapa(BigDecimal numEtapa) {
        markAsChanged("NUMETAPA", numEtapa);
   }

   public BigDecimal getNumEtapaPai() {
        return this.getVo().asBigDecimal("NUMETAPAPAI");
   }

   public void setNumEtapaPai(BigDecimal numEtapaPai) {
        markAsChanged("NUMETAPAPAI", numEtapaPai);
   }

   public BigDecimal getNumSeq() {
        return this.getVo().asBigDecimal("NUMSEQ");
   }

   public void setNumSeq(BigDecimal numSeq) {
        markAsChanged("NUMSEQ", numSeq);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public String getSuplementa() {
        return this.getVo().asString("SUPLEMENTA");
   }

   public void setSuplementa(String suplementa) {
        markAsChanged("SUPLEMENTA", suplementa);
   }

   public String getSuplementado() {
        return this.getVo().asString("SUPLEMENTADO");
   }

   public void setSuplementado(String suplementado) {
        markAsChanged("SUPLEMENTADO", suplementado);
   }

   public String getTipValor() {
        return this.getVo().asString("TIPVALOR");
   }

   public void setTipValor(String tipValor) {
        markAsChanged("TIPVALOR", tipValor);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getVlrSuplementa() {
        return this.getVo().asBigDecimal("VLRSUPLEMENTA");
   }

   public void setVlrSuplementa(BigDecimal vlrSuplementa) {
        markAsChanged("VLRSUPLEMENTA", vlrSuplementa);
   }

   public BigDecimal getVlrSuplementado() {
        return this.getVo().asBigDecimal("VLRSUPLEMENTADO");
   }

   public void setVlrSuplementado(BigDecimal vlrSuplementado) {
        markAsChanged("VLRSUPLEMENTADO", vlrSuplementado);
   }

   public BigDecimal getVlrSuplementadoRea() {
        return this.getVo().asBigDecimal("VLRSUPLEMENTADOREA");
   }

   public void setVlrSuplementadoRea(BigDecimal vlrSuplementadoRea) {
        markAsChanged("VLRSUPLEMENTADOREA", vlrSuplementadoRea);
   }

   public BigDecimal getVlrSuplementaRea() {
        return this.getVo().asBigDecimal("VLRSUPLEMENTAREA");
   }

   public void setVlrSuplementaRea(BigDecimal vlrSuplementaRea) {
        markAsChanged("VLRSUPLEMENTAREA", vlrSuplementaRea);
   }

   public BigDecimal getNumModelo() {
        return this.getVo().asBigDecimal("NUMMODELO");
   }

   public void setNumModelo(BigDecimal numModelo) {
        markAsChanged("NUMMODELO", numModelo);
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
        return this;
   }
}
