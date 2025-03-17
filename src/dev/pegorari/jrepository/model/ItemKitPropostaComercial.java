package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItemKitPropostaComercial implements SankhyaEntity<ItemKitPropostaComercial> {

   private BigDecimal vlrUnitPis;
   private BigDecimal codProd;
   private String descrItem;
   private BigDecimal fatorImpostos;
   private BigDecimal fatorVernet;
   private BigDecimal nuNota;
   private BigDecimal nuProjeto;
   private String partNumber;
   private BigDecimal percCofins;
   private BigDecimal percCssl;
   private BigDecimal percDesc;
   private BigDecimal percFrete;
   private BigDecimal percImpostosCom;
   private BigDecimal percImpostosVen;
   private BigDecimal percInternacao;
   private BigDecimal percMargemProp;
   private BigDecimal percPis;
   private BigDecimal qtd;
   private BigDecimal qtdSpare;
   private String rateado;
   private BigDecimal seqItem;
   private BigDecimal seqKit;
   private BigDecimal sequencia;
   private String servico;
   private String tipKit;
   private String versaoProjeto;
   private BigDecimal vlrDesconto;
   private BigDecimal vlrImpostosCom;
   private BigDecimal vlrImpostosVen;
   private BigDecimal vlrInternacao;
   private BigDecimal vlrMargem;
   private BigDecimal vlrTotCif;
   private BigDecimal vlrTotComMargem;
   private BigDecimal vlrTotComSpare;
   private BigDecimal vlrTotDesc;
   private BigDecimal vlrTotFinal;
   private BigDecimal vlrTotFinalArred;
   private BigDecimal vlrTotFob;
   private BigDecimal vlrTotImpostosCom;
   private BigDecimal vlrTotImpostosVen;
   private BigDecimal vlrTotInternacao;
   private BigDecimal vlrTotMargem;
   private BigDecimal vlrUnitCif;
   private BigDecimal vlrUnitCofins;
   private BigDecimal vlrUnitComMargem;
   private BigDecimal vlrUnitComSpare;
   private BigDecimal vlrUnitCssl;
   private BigDecimal vlrUnitFinal;
   private BigDecimal vlrUnitFinalArred;
   private BigDecimal vlrUnitFob;
   private BigDecimal vlrUnitFobDesc;
   private BigDecimal vlrUnitFrete;
   private BigDecimal vlrUnitIcms;
   private BigDecimal vlrUnitIi;
   private BigDecimal vlrUnitIpi;
   private BigDecimal aliqIcms;
   private BigDecimal aliqIi;
   private BigDecimal aliqIpi;
   private String codNbm;
   private BigDecimal codParcForn;

   public BigDecimal getVlrUnitPis() {
        return vlrUnitPis;
   }

   public void setVlrUnitPis(BigDecimal vlrUnitPis) {
        this.vlrUnitPis = vlrUnitPis;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getDescrItem() {
        return descrItem;
   }

   public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
   }

   public BigDecimal getFatorImpostos() {
        return fatorImpostos;
   }

   public void setFatorImpostos(BigDecimal fatorImpostos) {
        this.fatorImpostos = fatorImpostos;
   }

   public BigDecimal getFatorVernet() {
        return fatorVernet;
   }

   public void setFatorVernet(BigDecimal fatorVernet) {
        this.fatorVernet = fatorVernet;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuProjeto() {
        return nuProjeto;
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        this.nuProjeto = nuProjeto;
   }

   public String getPartNumber() {
        return partNumber;
   }

   public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
   }

   public BigDecimal getPercCofins() {
        return percCofins;
   }

   public void setPercCofins(BigDecimal percCofins) {
        this.percCofins = percCofins;
   }

   public BigDecimal getPercCssl() {
        return percCssl;
   }

   public void setPercCssl(BigDecimal percCssl) {
        this.percCssl = percCssl;
   }

   public BigDecimal getPercDesc() {
        return percDesc;
   }

   public void setPercDesc(BigDecimal percDesc) {
        this.percDesc = percDesc;
   }

   public BigDecimal getPercFrete() {
        return percFrete;
   }

   public void setPercFrete(BigDecimal percFrete) {
        this.percFrete = percFrete;
   }

   public BigDecimal getPercImpostosCom() {
        return percImpostosCom;
   }

   public void setPercImpostosCom(BigDecimal percImpostosCom) {
        this.percImpostosCom = percImpostosCom;
   }

   public BigDecimal getPercImpostosVen() {
        return percImpostosVen;
   }

   public void setPercImpostosVen(BigDecimal percImpostosVen) {
        this.percImpostosVen = percImpostosVen;
   }

   public BigDecimal getPercInternacao() {
        return percInternacao;
   }

   public void setPercInternacao(BigDecimal percInternacao) {
        this.percInternacao = percInternacao;
   }

   public BigDecimal getPercMargemProp() {
        return percMargemProp;
   }

   public void setPercMargemProp(BigDecimal percMargemProp) {
        this.percMargemProp = percMargemProp;
   }

   public BigDecimal getPercPis() {
        return percPis;
   }

   public void setPercPis(BigDecimal percPis) {
        this.percPis = percPis;
   }

   public BigDecimal getQtd() {
        return qtd;
   }

   public void setQtd(BigDecimal qtd) {
        this.qtd = qtd;
   }

   public BigDecimal getQtdSpare() {
        return qtdSpare;
   }

   public void setQtdSpare(BigDecimal qtdSpare) {
        this.qtdSpare = qtdSpare;
   }

   public String getRateado() {
        return rateado;
   }

   public void setRateado(String rateado) {
        this.rateado = rateado;
   }

   public BigDecimal getSeqItem() {
        return seqItem;
   }

   public void setSeqItem(BigDecimal seqItem) {
        this.seqItem = seqItem;
   }

   public BigDecimal getSeqKit() {
        return seqKit;
   }

   public void setSeqKit(BigDecimal seqKit) {
        this.seqKit = seqKit;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getServico() {
        return servico;
   }

   public void setServico(String servico) {
        this.servico = servico;
   }

   public String getTipKit() {
        return tipKit;
   }

   public void setTipKit(String tipKit) {
        this.tipKit = tipKit;
   }

   public String getVersaoProjeto() {
        return versaoProjeto;
   }

   public void setVersaoProjeto(String versaoProjeto) {
        this.versaoProjeto = versaoProjeto;
   }

   public BigDecimal getVlrDesconto() {
        return vlrDesconto;
   }

   public void setVlrDesconto(BigDecimal vlrDesconto) {
        this.vlrDesconto = vlrDesconto;
   }

   public BigDecimal getVlrImpostosCom() {
        return vlrImpostosCom;
   }

   public void setVlrImpostosCom(BigDecimal vlrImpostosCom) {
        this.vlrImpostosCom = vlrImpostosCom;
   }

   public BigDecimal getVlrImpostosVen() {
        return vlrImpostosVen;
   }

   public void setVlrImpostosVen(BigDecimal vlrImpostosVen) {
        this.vlrImpostosVen = vlrImpostosVen;
   }

   public BigDecimal getVlrInternacao() {
        return vlrInternacao;
   }

   public void setVlrInternacao(BigDecimal vlrInternacao) {
        this.vlrInternacao = vlrInternacao;
   }

   public BigDecimal getVlrMargem() {
        return vlrMargem;
   }

   public void setVlrMargem(BigDecimal vlrMargem) {
        this.vlrMargem = vlrMargem;
   }

   public BigDecimal getVlrTotCif() {
        return vlrTotCif;
   }

   public void setVlrTotCif(BigDecimal vlrTotCif) {
        this.vlrTotCif = vlrTotCif;
   }

   public BigDecimal getVlrTotComMargem() {
        return vlrTotComMargem;
   }

   public void setVlrTotComMargem(BigDecimal vlrTotComMargem) {
        this.vlrTotComMargem = vlrTotComMargem;
   }

   public BigDecimal getVlrTotComSpare() {
        return vlrTotComSpare;
   }

   public void setVlrTotComSpare(BigDecimal vlrTotComSpare) {
        this.vlrTotComSpare = vlrTotComSpare;
   }

   public BigDecimal getVlrTotDesc() {
        return vlrTotDesc;
   }

   public void setVlrTotDesc(BigDecimal vlrTotDesc) {
        this.vlrTotDesc = vlrTotDesc;
   }

   public BigDecimal getVlrTotFinal() {
        return vlrTotFinal;
   }

   public void setVlrTotFinal(BigDecimal vlrTotFinal) {
        this.vlrTotFinal = vlrTotFinal;
   }

   public BigDecimal getVlrTotFinalArred() {
        return vlrTotFinalArred;
   }

   public void setVlrTotFinalArred(BigDecimal vlrTotFinalArred) {
        this.vlrTotFinalArred = vlrTotFinalArred;
   }

   public BigDecimal getVlrTotFob() {
        return vlrTotFob;
   }

   public void setVlrTotFob(BigDecimal vlrTotFob) {
        this.vlrTotFob = vlrTotFob;
   }

   public BigDecimal getVlrTotImpostosCom() {
        return vlrTotImpostosCom;
   }

   public void setVlrTotImpostosCom(BigDecimal vlrTotImpostosCom) {
        this.vlrTotImpostosCom = vlrTotImpostosCom;
   }

   public BigDecimal getVlrTotImpostosVen() {
        return vlrTotImpostosVen;
   }

   public void setVlrTotImpostosVen(BigDecimal vlrTotImpostosVen) {
        this.vlrTotImpostosVen = vlrTotImpostosVen;
   }

   public BigDecimal getVlrTotInternacao() {
        return vlrTotInternacao;
   }

   public void setVlrTotInternacao(BigDecimal vlrTotInternacao) {
        this.vlrTotInternacao = vlrTotInternacao;
   }

   public BigDecimal getVlrTotMargem() {
        return vlrTotMargem;
   }

   public void setVlrTotMargem(BigDecimal vlrTotMargem) {
        this.vlrTotMargem = vlrTotMargem;
   }

   public BigDecimal getVlrUnitCif() {
        return vlrUnitCif;
   }

   public void setVlrUnitCif(BigDecimal vlrUnitCif) {
        this.vlrUnitCif = vlrUnitCif;
   }

   public BigDecimal getVlrUnitCofins() {
        return vlrUnitCofins;
   }

   public void setVlrUnitCofins(BigDecimal vlrUnitCofins) {
        this.vlrUnitCofins = vlrUnitCofins;
   }

   public BigDecimal getVlrUnitComMargem() {
        return vlrUnitComMargem;
   }

   public void setVlrUnitComMargem(BigDecimal vlrUnitComMargem) {
        this.vlrUnitComMargem = vlrUnitComMargem;
   }

   public BigDecimal getVlrUnitComSpare() {
        return vlrUnitComSpare;
   }

   public void setVlrUnitComSpare(BigDecimal vlrUnitComSpare) {
        this.vlrUnitComSpare = vlrUnitComSpare;
   }

   public BigDecimal getVlrUnitCssl() {
        return vlrUnitCssl;
   }

   public void setVlrUnitCssl(BigDecimal vlrUnitCssl) {
        this.vlrUnitCssl = vlrUnitCssl;
   }

   public BigDecimal getVlrUnitFinal() {
        return vlrUnitFinal;
   }

   public void setVlrUnitFinal(BigDecimal vlrUnitFinal) {
        this.vlrUnitFinal = vlrUnitFinal;
   }

   public BigDecimal getVlrUnitFinalArred() {
        return vlrUnitFinalArred;
   }

   public void setVlrUnitFinalArred(BigDecimal vlrUnitFinalArred) {
        this.vlrUnitFinalArred = vlrUnitFinalArred;
   }

   public BigDecimal getVlrUnitFob() {
        return vlrUnitFob;
   }

   public void setVlrUnitFob(BigDecimal vlrUnitFob) {
        this.vlrUnitFob = vlrUnitFob;
   }

   public BigDecimal getVlrUnitFobDesc() {
        return vlrUnitFobDesc;
   }

   public void setVlrUnitFobDesc(BigDecimal vlrUnitFobDesc) {
        this.vlrUnitFobDesc = vlrUnitFobDesc;
   }

   public BigDecimal getVlrUnitFrete() {
        return vlrUnitFrete;
   }

   public void setVlrUnitFrete(BigDecimal vlrUnitFrete) {
        this.vlrUnitFrete = vlrUnitFrete;
   }

   public BigDecimal getVlrUnitIcms() {
        return vlrUnitIcms;
   }

   public void setVlrUnitIcms(BigDecimal vlrUnitIcms) {
        this.vlrUnitIcms = vlrUnitIcms;
   }

   public BigDecimal getVlrUnitIi() {
        return vlrUnitIi;
   }

   public void setVlrUnitIi(BigDecimal vlrUnitIi) {
        this.vlrUnitIi = vlrUnitIi;
   }

   public BigDecimal getVlrUnitIpi() {
        return vlrUnitIpi;
   }

   public void setVlrUnitIpi(BigDecimal vlrUnitIpi) {
        this.vlrUnitIpi = vlrUnitIpi;
   }

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAliqIi() {
        return aliqIi;
   }

   public void setAliqIi(BigDecimal aliqIi) {
        this.aliqIi = aliqIi;
   }

   public BigDecimal getAliqIpi() {
        return aliqIpi;
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
   }

   public String getCodNbm() {
        return codNbm;
   }

   public void setCodNbm(String codNbm) {
        this.codNbm = codNbm;
   }

   public BigDecimal getCodParcForn() {
        return codParcForn;
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        this.codParcForn = codParcForn;
   }

   @Override
   public String getEntityName() {
        return "ItemKitPropostaComercial";
   }

   @Override
   public ItemKitPropostaComercial fromVO(DynamicVO vo) {
        this.vlrUnitPis = vo.asBigDecimal("VLRUNITPIS");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.descrItem = vo.asString("DESCRITEM");
        this.fatorImpostos = vo.asBigDecimal("FATORIMPOSTOS");
        this.fatorVernet = vo.asBigDecimal("FATORVERNET");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuProjeto = vo.asBigDecimal("NUPROJETO");
        this.partNumber = vo.asString("PARTNUMBER");
        this.percCofins = vo.asBigDecimal("PERCCOFINS");
        this.percCssl = vo.asBigDecimal("PERCCSSL");
        this.percDesc = vo.asBigDecimal("PERCDESC");
        this.percFrete = vo.asBigDecimal("PERCFRETE");
        this.percImpostosCom = vo.asBigDecimal("PERCIMPOSTOSCOM");
        this.percImpostosVen = vo.asBigDecimal("PERCIMPOSTOSVEN");
        this.percInternacao = vo.asBigDecimal("PERCINTERNACAO");
        this.percMargemProp = vo.asBigDecimal("PERCMARGEMPROP");
        this.percPis = vo.asBigDecimal("PERCPIS");
        this.qtd = vo.asBigDecimal("QTD");
        this.qtdSpare = vo.asBigDecimal("QTDSPARE");
        this.rateado = vo.asString("RATEADO");
        this.seqItem = vo.asBigDecimal("SEQITEM");
        this.seqKit = vo.asBigDecimal("SEQKIT");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.servico = vo.asString("SERVICO");
        this.tipKit = vo.asString("TIPKIT");
        this.versaoProjeto = vo.asString("VERSAOPROJETO");
        this.vlrDesconto = vo.asBigDecimal("VLRDESCONTO");
        this.vlrImpostosCom = vo.asBigDecimal("VLRIMPOSTOSCOM");
        this.vlrImpostosVen = vo.asBigDecimal("VLRIMPOSTOSVEN");
        this.vlrInternacao = vo.asBigDecimal("VLRINTERNACAO");
        this.vlrMargem = vo.asBigDecimal("VLRMARGEM");
        this.vlrTotCif = vo.asBigDecimal("VLRTOTCIF");
        this.vlrTotComMargem = vo.asBigDecimal("VLRTOTCOMMARGEM");
        this.vlrTotComSpare = vo.asBigDecimal("VLRTOTCOMSPARE");
        this.vlrTotDesc = vo.asBigDecimal("VLRTOTDESC");
        this.vlrTotFinal = vo.asBigDecimal("VLRTOTFINAL");
        this.vlrTotFinalArred = vo.asBigDecimal("VLRTOTFINALARRED");
        this.vlrTotFob = vo.asBigDecimal("VLRTOTFOB");
        this.vlrTotImpostosCom = vo.asBigDecimal("VLRTOTIMPOSTOSCOM");
        this.vlrTotImpostosVen = vo.asBigDecimal("VLRTOTIMPOSTOSVEN");
        this.vlrTotInternacao = vo.asBigDecimal("VLRTOTINTERNACAO");
        this.vlrTotMargem = vo.asBigDecimal("VLRTOTMARGEM");
        this.vlrUnitCif = vo.asBigDecimal("VLRUNITCIF");
        this.vlrUnitCofins = vo.asBigDecimal("VLRUNITCOFINS");
        this.vlrUnitComMargem = vo.asBigDecimal("VLRUNITCOMMARGEM");
        this.vlrUnitComSpare = vo.asBigDecimal("VLRUNITCOMSPARE");
        this.vlrUnitCssl = vo.asBigDecimal("VLRUNITCSSL");
        this.vlrUnitFinal = vo.asBigDecimal("VLRUNITFINAL");
        this.vlrUnitFinalArred = vo.asBigDecimal("VLRUNITFINALARRED");
        this.vlrUnitFob = vo.asBigDecimal("VLRUNITFOB");
        this.vlrUnitFobDesc = vo.asBigDecimal("VLRUNITFOBDESC");
        this.vlrUnitFrete = vo.asBigDecimal("VLRUNITFRETE");
        this.vlrUnitIcms = vo.asBigDecimal("VLRUNITICMS");
        this.vlrUnitIi = vo.asBigDecimal("VLRUNITII");
        this.vlrUnitIpi = vo.asBigDecimal("VLRUNITIPI");
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.aliqIi = vo.asBigDecimal("ALIQII");
        this.aliqIpi = vo.asBigDecimal("ALIQIPI");
        this.codNbm = vo.asString("CODNBM");
        this.codParcForn = vo.asBigDecimal("CODPARCFORN");
        return this;
   }
}
