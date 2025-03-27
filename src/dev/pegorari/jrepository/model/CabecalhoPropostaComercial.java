package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoPropostaComercial extends AbstractSankhyaEntity<CabecalhoPropostaComercial> {
   public BigDecimal getPercDesconto() {
        return this.getVo().asBigDecimal("PERCDESCONTO");
   }

   public void setPercDesconto(BigDecimal percDesconto) {
        markAsChanged("PERCDESCONTO", percDesconto);
   }

   public BigDecimal getPercDescProd() {
        return this.getVo().asBigDecimal("PERCDESCPROD");
   }

   public void setPercDescProd(BigDecimal percDescProd) {
        markAsChanged("PERCDESCPROD", percDescProd);
   }

   public BigDecimal getPercDescServ() {
        return this.getVo().asBigDecimal("PERCDESCSERV");
   }

   public void setPercDescServ(BigDecimal percDescServ) {
        markAsChanged("PERCDESCSERV", percDescServ);
   }

   public BigDecimal getPercFrete() {
        return this.getVo().asBigDecimal("PERCFRETE");
   }

   public void setPercFrete(BigDecimal percFrete) {
        markAsChanged("PERCFRETE", percFrete);
   }

   public BigDecimal getPercImpostoProd() {
        return this.getVo().asBigDecimal("PERCIMPOSTOPROD");
   }

   public void setPercImpostoProd(BigDecimal percImpostoProd) {
        markAsChanged("PERCIMPOSTOPROD", percImpostoProd);
   }

   public BigDecimal getPercImpostoServ() {
        return this.getVo().asBigDecimal("PERCIMPOSTOSERV");
   }

   public void setPercImpostoServ(BigDecimal percImpostoServ) {
        markAsChanged("PERCIMPOSTOSERV", percImpostoServ);
   }

   public BigDecimal getPercImpostoSven() {
        return this.getVo().asBigDecimal("PERCIMPOSTOSVEN");
   }

   public void setPercImpostoSven(BigDecimal percImpostoSven) {
        markAsChanged("PERCIMPOSTOSVEN", percImpostoSven);
   }

   public BigDecimal getCodMoeda() {
        return this.getVo().asBigDecimal("CODMOEDA");
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtProjeto() {
        return this.getVo().asTimestamp("DTPROJETO");
   }

   public void setDtProjeto(Timestamp dtProjeto) {
        markAsChanged("DTPROJETO", dtProjeto);
   }

   public String getDupNovaVersao() {
        return this.getVo().asString("DUPNOVAVERSAO");
   }

   public void setDupNovaVersao(String dupNovaVersao) {
        markAsChanged("DUPNOVAVERSAO", dupNovaVersao);
   }

   public BigDecimal getPercInternacao() {
        return this.getVo().asBigDecimal("PERCINTERNACAO");
   }

   public void setPercInternacao(BigDecimal percInternacao) {
        markAsChanged("PERCINTERNACAO", percInternacao);
   }

   public BigDecimal getPercInternacaoProd() {
        return this.getVo().asBigDecimal("PERCINTERNACAOPROD");
   }

   public void setPercInternacaoProd(BigDecimal percInternacaoProd) {
        markAsChanged("PERCINTERNACAOPROD", percInternacaoProd);
   }

   public BigDecimal getPercInternacaoServ() {
        return this.getVo().asBigDecimal("PERCINTERNACAOSERV");
   }

   public void setPercInternacaoServ(BigDecimal percInternacaoServ) {
        markAsChanged("PERCINTERNACAOSERV", percInternacaoServ);
   }

   public BigDecimal getPercLucroLiquido() {
        return this.getVo().asBigDecimal("PERCLUCROLIQUIDO");
   }

   public void setPercLucroLiquido(BigDecimal percLucroLiquido) {
        markAsChanged("PERCLUCROLIQUIDO", percLucroLiquido);
   }

   public BigDecimal getPercMargemProd() {
        return this.getVo().asBigDecimal("PERCMARGEMPROD");
   }

   public void setPercMargemProd(BigDecimal percMargemProd) {
        markAsChanged("PERCMARGEMPROD", percMargemProd);
   }

   public BigDecimal getPercMargemProp() {
        return this.getVo().asBigDecimal("PERCMARGEMPROP");
   }

   public void setPercMargemProp(BigDecimal percMargemProp) {
        markAsChanged("PERCMARGEMPROP", percMargemProp);
   }

   public BigDecimal getPercMargemServ() {
        return this.getVo().asBigDecimal("PERCMARGEMSERV");
   }

   public void setPercMargemServ(BigDecimal percMargemServ) {
        markAsChanged("PERCMARGEMSERV", percMargemServ);
   }

   public String getVersaoProjeto() {
        return this.getVo().asString("VERSAOPROJETO");
   }

   public void setVersaoProjeto(String versaoProjeto) {
        markAsChanged("VERSAOPROJETO", versaoProjeto);
   }

   public BigDecimal getVlrCusEquipCif() {
        return this.getVo().asBigDecimal("VLRCUSEQUIPCIF");
   }

   public void setVlrCusEquipCif(BigDecimal vlrCusEquipCif) {
        markAsChanged("VLRCUSEQUIPCIF", vlrCusEquipCif);
   }

   public BigDecimal getVlrCusEquipFob() {
        return this.getVo().asBigDecimal("VLRCUSEQUIPFOB");
   }

   public void setVlrCusEquipFob(BigDecimal vlrCusEquipFob) {
        markAsChanged("VLRCUSEQUIPFOB", vlrCusEquipFob);
   }

   public BigDecimal getVlrCusEquipMargem() {
        return this.getVo().asBigDecimal("VLRCUSEQUIPMARGEM");
   }

   public void setVlrCusEquipMargem(BigDecimal vlrCusEquipMargem) {
        markAsChanged("VLRCUSEQUIPMARGEM", vlrCusEquipMargem);
   }

   public BigDecimal getVlrDesconto() {
        return this.getVo().asBigDecimal("VLRDESCONTO");
   }

   public void setVlrDesconto(BigDecimal vlrDesconto) {
        markAsChanged("VLRDESCONTO", vlrDesconto);
   }

   public BigDecimal getVlrGarantiaTecnico() {
        return this.getVo().asBigDecimal("VLRGARANTIATECNICO");
   }

   public void setVlrGarantiaTecnico(BigDecimal vlrGarantiaTecnico) {
        markAsChanged("VLRGARANTIATECNICO", vlrGarantiaTecnico);
   }

   public BigDecimal getVlrGarHardCif() {
        return this.getVo().asBigDecimal("VLRGARHARDCIF");
   }

   public void setVlrGarHardCif(BigDecimal vlrGarHardCif) {
        markAsChanged("VLRGARHARDCIF", vlrGarHardCif);
   }

   public BigDecimal getVlrGarHardFob() {
        return this.getVo().asBigDecimal("VLRGARHARDFOB");
   }

   public void setVlrGarHardFob(BigDecimal vlrGarHardFob) {
        markAsChanged("VLRGARHARDFOB", vlrGarHardFob);
   }

   public BigDecimal getVlrGarHardMargem() {
        return this.getVo().asBigDecimal("VLRGARHARDMARGEM");
   }

   public void setVlrGarHardMargem(BigDecimal vlrGarHardMargem) {
        markAsChanged("VLRGARHARDMARGEM", vlrGarHardMargem);
   }

   public BigDecimal getVlrGarSoftCif() {
        return this.getVo().asBigDecimal("VLRGARSOFTCIF");
   }

   public void setVlrGarSoftCif(BigDecimal vlrGarSoftCif) {
        markAsChanged("VLRGARSOFTCIF", vlrGarSoftCif);
   }

   public BigDecimal getVlrGarSoftFob() {
        return this.getVo().asBigDecimal("VLRGARSOFTFOB");
   }

   public void setVlrGarSoftFob(BigDecimal vlrGarSoftFob) {
        markAsChanged("VLRGARSOFTFOB", vlrGarSoftFob);
   }

   public BigDecimal getVlrGarSoftMargem() {
        return this.getVo().asBigDecimal("VLRGARSOFTMARGEM");
   }

   public void setVlrGarSoftMargem(BigDecimal vlrGarSoftMargem) {
        markAsChanged("VLRGARSOFTMARGEM", vlrGarSoftMargem);
   }

   public BigDecimal getVlrImpostoSven() {
        return this.getVo().asBigDecimal("VLRIMPOSTOSVEN");
   }

   public void setVlrImpostoSven(BigDecimal vlrImpostoSven) {
        markAsChanged("VLRIMPOSTOSVEN", vlrImpostoSven);
   }

   public BigDecimal getVlrInstalacao() {
        return this.getVo().asBigDecimal("VLRINSTALACAO");
   }

   public void setVlrInstalacao(BigDecimal vlrInstalacao) {
        markAsChanged("VLRINSTALACAO", vlrInstalacao);
   }

   public BigDecimal getVlrInternacao() {
        return this.getVo().asBigDecimal("VLRINTERNACAO");
   }

   public void setVlrInternacao(BigDecimal vlrInternacao) {
        markAsChanged("VLRINTERNACAO", vlrInternacao);
   }

   public BigDecimal getVlrLucroLiquidoReal() {
        return this.getVo().asBigDecimal("VLRLUCROLIQUIDOREAL");
   }

   public void setVlrLucroLiquidoReal(BigDecimal vlrLucroLiquidoReal) {
        markAsChanged("VLRLUCROLIQUIDOREAL", vlrLucroLiquidoReal);
   }

   public BigDecimal getVlrMargemProp() {
        return this.getVo().asBigDecimal("VLRMARGEMPROP");
   }

   public void setVlrMargemProp(BigDecimal vlrMargemProp) {
        markAsChanged("VLRMARGEMPROP", vlrMargemProp);
   }

   public BigDecimal getVlrMoeda() {
        return this.getVo().asBigDecimal("VLRMOEDA");
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
   }

   public BigDecimal getVlrOutrosCusCif() {
        return this.getVo().asBigDecimal("VLROUTROSCUSCIF");
   }

   public void setVlrOutrosCusCif(BigDecimal vlrOutrosCusCif) {
        markAsChanged("VLROUTROSCUSCIF", vlrOutrosCusCif);
   }

   public BigDecimal getVlrOutrosCusMargem() {
        return this.getVo().asBigDecimal("VLROUTROSCUSMARGEM");
   }

   public void setVlrOutrosCusMargem(BigDecimal vlrOutrosCusMargem) {
        markAsChanged("VLROUTROSCUSMARGEM", vlrOutrosCusMargem);
   }

   public BigDecimal getVlrTotal() {
        return this.getVo().asBigDecimal("VLRTOTAL");
   }

   public void setVlrTotal(BigDecimal vlrTotal) {
        markAsChanged("VLRTOTAL", vlrTotal);
   }

   public BigDecimal getVlrTotalArredondado() {
        return this.getVo().asBigDecimal("VLRTOTALARREDONDADO");
   }

   public void setVlrTotalArredondado(BigDecimal vlrTotalArredondado) {
        markAsChanged("VLRTOTALARREDONDADO", vlrTotalArredondado);
   }

   public BigDecimal getVlrTotalCif() {
        return this.getVo().asBigDecimal("VLRTOTALCIF");
   }

   public void setVlrTotalCif(BigDecimal vlrTotalCif) {
        markAsChanged("VLRTOTALCIF", vlrTotalCif);
   }

   public BigDecimal getVlrTotalComissao() {
        return this.getVo().asBigDecimal("VLRTOTALCOMISSAO");
   }

   public void setVlrTotalComissao(BigDecimal vlrTotalComissao) {
        markAsChanged("VLRTOTALCOMISSAO", vlrTotalComissao);
   }

   public BigDecimal getVlrTotalComSpare() {
        return this.getVo().asBigDecimal("VLRTOTALCOMSPARE");
   }

   public void setVlrTotalComSpare(BigDecimal vlrTotalComSpare) {
        markAsChanged("VLRTOTALCOMSPARE", vlrTotalComSpare);
   }

   public BigDecimal getVlrTotalCus() {
        return this.getVo().asBigDecimal("VLRTOTALCUS");
   }

   public void setVlrTotalCus(BigDecimal vlrTotalCus) {
        markAsChanged("VLRTOTALCUS", vlrTotalCus);
   }

   public BigDecimal getVlrTotalFob() {
        return this.getVo().asBigDecimal("VLRTOTALFOB");
   }

   public void setVlrTotalFob(BigDecimal vlrTotalFob) {
        markAsChanged("VLRTOTALFOB", vlrTotalFob);
   }

   public BigDecimal getVlrTotalReal() {
        return this.getVo().asBigDecimal("VLRTOTALREAL");
   }

   public void setVlrTotalReal(BigDecimal vlrTotalReal) {
        markAsChanged("VLRTOTALREAL", vlrTotalReal);
   }

   public BigDecimal getVlrTreinamento() {
        return this.getVo().asBigDecimal("VLRTREINAMENTO");
   }

   public void setVlrTreinamento(BigDecimal vlrTreinamento) {
        markAsChanged("VLRTREINAMENTO", vlrTreinamento);
   }

   public BigDecimal getVlrViagemInt() {
        return this.getVo().asBigDecimal("VLRVIAGEMINT");
   }

   public void setVlrViagemInt(BigDecimal vlrViagemInt) {
        markAsChanged("VLRVIAGEMINT", vlrViagemInt);
   }

   public BigDecimal getVlrViagemNac() {
        return this.getVo().asBigDecimal("VLRVIAGEMNAC");
   }

   public void setVlrViagemNac(BigDecimal vlrViagemNac) {
        markAsChanged("VLRVIAGEMNAC", vlrViagemNac);
   }

   public String getNomeProj() {
        return this.getVo().asString("NOMEPROJ");
   }

   public void setNomeProj(String nomeProj) {
        markAsChanged("NOMEPROJ", nomeProj);
   }

   public BigDecimal getNuProjeto() {
        return this.getVo().asBigDecimal("NUPROJETO");
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        markAsChanged("NUPROJETO", nuProjeto);
   }

   public char[] getObs() {
        return this.getVo().asClob("OBS");
   }

   public void setObs(char[] obs) {
        markAsChanged("OBS", obs);
   }

   public BigDecimal getPercComissao1() {
        return this.getVo().asBigDecimal("PERCCOMISSAO1");
   }

   public void setPercComissao1(BigDecimal percComissao1) {
        markAsChanged("PERCCOMISSAO1", percComissao1);
   }

   public BigDecimal getPercComissao2() {
        return this.getVo().asBigDecimal("PERCCOMISSAO2");
   }

   public void setPercComissao2(BigDecimal percComissao2) {
        markAsChanged("PERCCOMISSAO2", percComissao2);
   }

   public BigDecimal getPercComissao3() {
        return this.getVo().asBigDecimal("PERCCOMISSAO3");
   }

   public void setPercComissao3(BigDecimal percComissao3) {
        markAsChanged("PERCCOMISSAO3", percComissao3);
   }

   public BigDecimal getPercComissao4() {
        return this.getVo().asBigDecimal("PERCCOMISSAO4");
   }

   public void setPercComissao4(BigDecimal percComissao4) {
        markAsChanged("PERCCOMISSAO4", percComissao4);
   }

   public BigDecimal getPercComissao5() {
        return this.getVo().asBigDecimal("PERCCOMISSAO5");
   }

   public void setPercComissao5(BigDecimal percComissao5) {
        markAsChanged("PERCCOMISSAO5", percComissao5);
   }

   @Override
   public String getTableName() {
        return "TGICAB";
   }

   @Override
   public String getEntityName() {
        return "CabecalhoPropostaComercial";
   }

   @Override
   public CabecalhoPropostaComercial fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
