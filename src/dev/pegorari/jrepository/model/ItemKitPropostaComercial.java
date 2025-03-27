package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemKitPropostaComercial extends AbstractSankhyaEntity<ItemKitPropostaComercial> {
   public BigDecimal getVlrUnitPis() {
        return this.getVo().asBigDecimal("VLRUNITPIS");
   }

   public void setVlrUnitPis(BigDecimal vlrUnitPis) {
        markAsChanged("VLRUNITPIS", vlrUnitPis);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getDescrItem() {
        return this.getVo().asString("DESCRITEM");
   }

   public void setDescrItem(String descrItem) {
        markAsChanged("DESCRITEM", descrItem);
   }

   public BigDecimal getFatorImpostos() {
        return this.getVo().asBigDecimal("FATORIMPOSTOS");
   }

   public void setFatorImpostos(BigDecimal fatorImpostos) {
        markAsChanged("FATORIMPOSTOS", fatorImpostos);
   }

   public BigDecimal getFatorVernet() {
        return this.getVo().asBigDecimal("FATORVERNET");
   }

   public void setFatorVernet(BigDecimal fatorVernet) {
        markAsChanged("FATORVERNET", fatorVernet);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuProjeto() {
        return this.getVo().asBigDecimal("NUPROJETO");
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        markAsChanged("NUPROJETO", nuProjeto);
   }

   public String getPartNumber() {
        return this.getVo().asString("PARTNUMBER");
   }

   public void setPartNumber(String partNumber) {
        markAsChanged("PARTNUMBER", partNumber);
   }

   public BigDecimal getPercCofins() {
        return this.getVo().asBigDecimal("PERCCOFINS");
   }

   public void setPercCofins(BigDecimal percCofins) {
        markAsChanged("PERCCOFINS", percCofins);
   }

   public BigDecimal getPercCssl() {
        return this.getVo().asBigDecimal("PERCCSSL");
   }

   public void setPercCssl(BigDecimal percCssl) {
        markAsChanged("PERCCSSL", percCssl);
   }

   public BigDecimal getPercDesc() {
        return this.getVo().asBigDecimal("PERCDESC");
   }

   public void setPercDesc(BigDecimal percDesc) {
        markAsChanged("PERCDESC", percDesc);
   }

   public BigDecimal getPercFrete() {
        return this.getVo().asBigDecimal("PERCFRETE");
   }

   public void setPercFrete(BigDecimal percFrete) {
        markAsChanged("PERCFRETE", percFrete);
   }

   public BigDecimal getPercImpostosCom() {
        return this.getVo().asBigDecimal("PERCIMPOSTOSCOM");
   }

   public void setPercImpostosCom(BigDecimal percImpostosCom) {
        markAsChanged("PERCIMPOSTOSCOM", percImpostosCom);
   }

   public BigDecimal getPercImpostosVen() {
        return this.getVo().asBigDecimal("PERCIMPOSTOSVEN");
   }

   public void setPercImpostosVen(BigDecimal percImpostosVen) {
        markAsChanged("PERCIMPOSTOSVEN", percImpostosVen);
   }

   public BigDecimal getPercInternacao() {
        return this.getVo().asBigDecimal("PERCINTERNACAO");
   }

   public void setPercInternacao(BigDecimal percInternacao) {
        markAsChanged("PERCINTERNACAO", percInternacao);
   }

   public BigDecimal getPercMargemProp() {
        return this.getVo().asBigDecimal("PERCMARGEMPROP");
   }

   public void setPercMargemProp(BigDecimal percMargemProp) {
        markAsChanged("PERCMARGEMPROP", percMargemProp);
   }

   public BigDecimal getPercPis() {
        return this.getVo().asBigDecimal("PERCPIS");
   }

   public void setPercPis(BigDecimal percPis) {
        markAsChanged("PERCPIS", percPis);
   }

   public BigDecimal getQtd() {
        return this.getVo().asBigDecimal("QTD");
   }

   public void setQtd(BigDecimal qtd) {
        markAsChanged("QTD", qtd);
   }

   public BigDecimal getQtdSpare() {
        return this.getVo().asBigDecimal("QTDSPARE");
   }

   public void setQtdSpare(BigDecimal qtdSpare) {
        markAsChanged("QTDSPARE", qtdSpare);
   }

   public String getRateado() {
        return this.getVo().asString("RATEADO");
   }

   public void setRateado(String rateado) {
        markAsChanged("RATEADO", rateado);
   }

   public BigDecimal getSeqItem() {
        return this.getVo().asBigDecimal("SEQITEM");
   }

   public void setSeqItem(BigDecimal seqItem) {
        markAsChanged("SEQITEM", seqItem);
   }

   public BigDecimal getSeqKit() {
        return this.getVo().asBigDecimal("SEQKIT");
   }

   public void setSeqKit(BigDecimal seqKit) {
        markAsChanged("SEQKIT", seqKit);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getServico() {
        return this.getVo().asString("SERVICO");
   }

   public void setServico(String servico) {
        markAsChanged("SERVICO", servico);
   }

   public String getTipKit() {
        return this.getVo().asString("TIPKIT");
   }

   public void setTipKit(String tipKit) {
        markAsChanged("TIPKIT", tipKit);
   }

   public String getVersaoProjeto() {
        return this.getVo().asString("VERSAOPROJETO");
   }

   public void setVersaoProjeto(String versaoProjeto) {
        markAsChanged("VERSAOPROJETO", versaoProjeto);
   }

   public BigDecimal getVlrDesconto() {
        return this.getVo().asBigDecimal("VLRDESCONTO");
   }

   public void setVlrDesconto(BigDecimal vlrDesconto) {
        markAsChanged("VLRDESCONTO", vlrDesconto);
   }

   public BigDecimal getVlrImpostosCom() {
        return this.getVo().asBigDecimal("VLRIMPOSTOSCOM");
   }

   public void setVlrImpostosCom(BigDecimal vlrImpostosCom) {
        markAsChanged("VLRIMPOSTOSCOM", vlrImpostosCom);
   }

   public BigDecimal getVlrImpostosVen() {
        return this.getVo().asBigDecimal("VLRIMPOSTOSVEN");
   }

   public void setVlrImpostosVen(BigDecimal vlrImpostosVen) {
        markAsChanged("VLRIMPOSTOSVEN", vlrImpostosVen);
   }

   public BigDecimal getVlrInternacao() {
        return this.getVo().asBigDecimal("VLRINTERNACAO");
   }

   public void setVlrInternacao(BigDecimal vlrInternacao) {
        markAsChanged("VLRINTERNACAO", vlrInternacao);
   }

   public BigDecimal getVlrMargem() {
        return this.getVo().asBigDecimal("VLRMARGEM");
   }

   public void setVlrMargem(BigDecimal vlrMargem) {
        markAsChanged("VLRMARGEM", vlrMargem);
   }

   public BigDecimal getVlrTotCif() {
        return this.getVo().asBigDecimal("VLRTOTCIF");
   }

   public void setVlrTotCif(BigDecimal vlrTotCif) {
        markAsChanged("VLRTOTCIF", vlrTotCif);
   }

   public BigDecimal getVlrTotComMargem() {
        return this.getVo().asBigDecimal("VLRTOTCOMMARGEM");
   }

   public void setVlrTotComMargem(BigDecimal vlrTotComMargem) {
        markAsChanged("VLRTOTCOMMARGEM", vlrTotComMargem);
   }

   public BigDecimal getVlrTotComSpare() {
        return this.getVo().asBigDecimal("VLRTOTCOMSPARE");
   }

   public void setVlrTotComSpare(BigDecimal vlrTotComSpare) {
        markAsChanged("VLRTOTCOMSPARE", vlrTotComSpare);
   }

   public BigDecimal getVlrTotDesc() {
        return this.getVo().asBigDecimal("VLRTOTDESC");
   }

   public void setVlrTotDesc(BigDecimal vlrTotDesc) {
        markAsChanged("VLRTOTDESC", vlrTotDesc);
   }

   public BigDecimal getVlrTotFinal() {
        return this.getVo().asBigDecimal("VLRTOTFINAL");
   }

   public void setVlrTotFinal(BigDecimal vlrTotFinal) {
        markAsChanged("VLRTOTFINAL", vlrTotFinal);
   }

   public BigDecimal getVlrTotFinalArred() {
        return this.getVo().asBigDecimal("VLRTOTFINALARRED");
   }

   public void setVlrTotFinalArred(BigDecimal vlrTotFinalArred) {
        markAsChanged("VLRTOTFINALARRED", vlrTotFinalArred);
   }

   public BigDecimal getVlrTotFob() {
        return this.getVo().asBigDecimal("VLRTOTFOB");
   }

   public void setVlrTotFob(BigDecimal vlrTotFob) {
        markAsChanged("VLRTOTFOB", vlrTotFob);
   }

   public BigDecimal getVlrTotImpostosCom() {
        return this.getVo().asBigDecimal("VLRTOTIMPOSTOSCOM");
   }

   public void setVlrTotImpostosCom(BigDecimal vlrTotImpostosCom) {
        markAsChanged("VLRTOTIMPOSTOSCOM", vlrTotImpostosCom);
   }

   public BigDecimal getVlrTotImpostosVen() {
        return this.getVo().asBigDecimal("VLRTOTIMPOSTOSVEN");
   }

   public void setVlrTotImpostosVen(BigDecimal vlrTotImpostosVen) {
        markAsChanged("VLRTOTIMPOSTOSVEN", vlrTotImpostosVen);
   }

   public BigDecimal getVlrTotInternacao() {
        return this.getVo().asBigDecimal("VLRTOTINTERNACAO");
   }

   public void setVlrTotInternacao(BigDecimal vlrTotInternacao) {
        markAsChanged("VLRTOTINTERNACAO", vlrTotInternacao);
   }

   public BigDecimal getVlrTotMargem() {
        return this.getVo().asBigDecimal("VLRTOTMARGEM");
   }

   public void setVlrTotMargem(BigDecimal vlrTotMargem) {
        markAsChanged("VLRTOTMARGEM", vlrTotMargem);
   }

   public BigDecimal getVlrUnitCif() {
        return this.getVo().asBigDecimal("VLRUNITCIF");
   }

   public void setVlrUnitCif(BigDecimal vlrUnitCif) {
        markAsChanged("VLRUNITCIF", vlrUnitCif);
   }

   public BigDecimal getVlrUnitCofins() {
        return this.getVo().asBigDecimal("VLRUNITCOFINS");
   }

   public void setVlrUnitCofins(BigDecimal vlrUnitCofins) {
        markAsChanged("VLRUNITCOFINS", vlrUnitCofins);
   }

   public BigDecimal getVlrUnitComMargem() {
        return this.getVo().asBigDecimal("VLRUNITCOMMARGEM");
   }

   public void setVlrUnitComMargem(BigDecimal vlrUnitComMargem) {
        markAsChanged("VLRUNITCOMMARGEM", vlrUnitComMargem);
   }

   public BigDecimal getVlrUnitComSpare() {
        return this.getVo().asBigDecimal("VLRUNITCOMSPARE");
   }

   public void setVlrUnitComSpare(BigDecimal vlrUnitComSpare) {
        markAsChanged("VLRUNITCOMSPARE", vlrUnitComSpare);
   }

   public BigDecimal getVlrUnitCssl() {
        return this.getVo().asBigDecimal("VLRUNITCSSL");
   }

   public void setVlrUnitCssl(BigDecimal vlrUnitCssl) {
        markAsChanged("VLRUNITCSSL", vlrUnitCssl);
   }

   public BigDecimal getVlrUnitFinal() {
        return this.getVo().asBigDecimal("VLRUNITFINAL");
   }

   public void setVlrUnitFinal(BigDecimal vlrUnitFinal) {
        markAsChanged("VLRUNITFINAL", vlrUnitFinal);
   }

   public BigDecimal getVlrUnitFinalArred() {
        return this.getVo().asBigDecimal("VLRUNITFINALARRED");
   }

   public void setVlrUnitFinalArred(BigDecimal vlrUnitFinalArred) {
        markAsChanged("VLRUNITFINALARRED", vlrUnitFinalArred);
   }

   public BigDecimal getVlrUnitFob() {
        return this.getVo().asBigDecimal("VLRUNITFOB");
   }

   public void setVlrUnitFob(BigDecimal vlrUnitFob) {
        markAsChanged("VLRUNITFOB", vlrUnitFob);
   }

   public BigDecimal getVlrUnitFobDesc() {
        return this.getVo().asBigDecimal("VLRUNITFOBDESC");
   }

   public void setVlrUnitFobDesc(BigDecimal vlrUnitFobDesc) {
        markAsChanged("VLRUNITFOBDESC", vlrUnitFobDesc);
   }

   public BigDecimal getVlrUnitFrete() {
        return this.getVo().asBigDecimal("VLRUNITFRETE");
   }

   public void setVlrUnitFrete(BigDecimal vlrUnitFrete) {
        markAsChanged("VLRUNITFRETE", vlrUnitFrete);
   }

   public BigDecimal getVlrUnitIcms() {
        return this.getVo().asBigDecimal("VLRUNITICMS");
   }

   public void setVlrUnitIcms(BigDecimal vlrUnitIcms) {
        markAsChanged("VLRUNITICMS", vlrUnitIcms);
   }

   public BigDecimal getVlrUnitIi() {
        return this.getVo().asBigDecimal("VLRUNITII");
   }

   public void setVlrUnitIi(BigDecimal vlrUnitIi) {
        markAsChanged("VLRUNITII", vlrUnitIi);
   }

   public BigDecimal getVlrUnitIpi() {
        return this.getVo().asBigDecimal("VLRUNITIPI");
   }

   public void setVlrUnitIpi(BigDecimal vlrUnitIpi) {
        markAsChanged("VLRUNITIPI", vlrUnitIpi);
   }

   public BigDecimal getAliqIcms() {
        return this.getVo().asBigDecimal("ALIQICMS");
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        markAsChanged("ALIQICMS", aliqIcms);
   }

   public BigDecimal getAliqIi() {
        return this.getVo().asBigDecimal("ALIQII");
   }

   public void setAliqIi(BigDecimal aliqIi) {
        markAsChanged("ALIQII", aliqIi);
   }

   public BigDecimal getAliqIpi() {
        return this.getVo().asBigDecimal("ALIQIPI");
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        markAsChanged("ALIQIPI", aliqIpi);
   }

   public String getCodNbm() {
        return this.getVo().asString("CODNBM");
   }

   public void setCodNbm(String codNbm) {
        markAsChanged("CODNBM", codNbm);
   }

   public BigDecimal getCodParcForn() {
        return this.getVo().asBigDecimal("CODPARCFORN");
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        markAsChanged("CODPARCFORN", codParcForn);
   }

   @Override
   public String getTableName() {
        return "TGIITE";
   }

   @Override
   public String getEntityName() {
        return "ItemKitPropostaComercial";
   }

   @Override
   public ItemKitPropostaComercial fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
