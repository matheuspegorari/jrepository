package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CabecalhoPropostaComercial extends AbstractSankhyaEntity<CabecalhoPropostaComercial> {
   private BigDecimal percDesconto;
   private BigDecimal percDescProd;
   private BigDecimal percDescServ;
   private BigDecimal percFrete;
   private BigDecimal percImpostoProd;
   private BigDecimal percImpostoServ;
   private BigDecimal percImpostoSven;
   private BigDecimal codMoeda;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private Timestamp dtProjeto;
   private String dupNovaVersao;
   private BigDecimal percInternacao;
   private BigDecimal percInternacaoProd;
   private BigDecimal percInternacaoServ;
   private BigDecimal percLucroLiquido;
   private BigDecimal percMargemProd;
   private BigDecimal percMargemProp;
   private BigDecimal percMargemServ;
   private String versaoProjeto;
   private BigDecimal vlrCusEquipCif;
   private BigDecimal vlrCusEquipFob;
   private BigDecimal vlrCusEquipMargem;
   private BigDecimal vlrDesconto;
   private BigDecimal vlrGarantiaTecnico;
   private BigDecimal vlrGarHardCif;
   private BigDecimal vlrGarHardFob;
   private BigDecimal vlrGarHardMargem;
   private BigDecimal vlrGarSoftCif;
   private BigDecimal vlrGarSoftFob;
   private BigDecimal vlrGarSoftMargem;
   private BigDecimal vlrImpostoSven;
   private BigDecimal vlrInstalacao;
   private BigDecimal vlrInternacao;
   private BigDecimal vlrLucroLiquidoReal;
   private BigDecimal vlrMargemProp;
   private BigDecimal vlrMoeda;
   private BigDecimal vlrOutrosCusCif;
   private BigDecimal vlrOutrosCusMargem;
   private BigDecimal vlrTotal;
   private BigDecimal vlrTotalArredondado;
   private BigDecimal vlrTotalCif;
   private BigDecimal vlrTotalComissao;
   private BigDecimal vlrTotalComSpare;
   private BigDecimal vlrTotalCus;
   private BigDecimal vlrTotalFob;
   private BigDecimal vlrTotalReal;
   private BigDecimal vlrTreinamento;
   private BigDecimal vlrViagemInt;
   private BigDecimal vlrViagemNac;
   private String nomeProj;
   private BigDecimal nuProjeto;
   private char[] obs;
   private BigDecimal percComissao1;
   private BigDecimal percComissao2;
   private BigDecimal percComissao3;
   private BigDecimal percComissao4;
   private BigDecimal percComissao5;

   public BigDecimal getPercDesconto() {
        return percDesconto;
   }

   public void setPercDesconto(BigDecimal percDesconto) {
        markAsChanged("PERCDESCONTO", percDesconto);
        this.percDesconto = percDesconto;
   }

   public BigDecimal getPercDescProd() {
        return percDescProd;
   }

   public void setPercDescProd(BigDecimal percDescProd) {
        markAsChanged("PERCDESCPROD", percDescProd);
        this.percDescProd = percDescProd;
   }

   public BigDecimal getPercDescServ() {
        return percDescServ;
   }

   public void setPercDescServ(BigDecimal percDescServ) {
        markAsChanged("PERCDESCSERV", percDescServ);
        this.percDescServ = percDescServ;
   }

   public BigDecimal getPercFrete() {
        return percFrete;
   }

   public void setPercFrete(BigDecimal percFrete) {
        markAsChanged("PERCFRETE", percFrete);
        this.percFrete = percFrete;
   }

   public BigDecimal getPercImpostoProd() {
        return percImpostoProd;
   }

   public void setPercImpostoProd(BigDecimal percImpostoProd) {
        markAsChanged("PERCIMPOSTOPROD", percImpostoProd);
        this.percImpostoProd = percImpostoProd;
   }

   public BigDecimal getPercImpostoServ() {
        return percImpostoServ;
   }

   public void setPercImpostoServ(BigDecimal percImpostoServ) {
        markAsChanged("PERCIMPOSTOSERV", percImpostoServ);
        this.percImpostoServ = percImpostoServ;
   }

   public BigDecimal getPercImpostoSven() {
        return percImpostoSven;
   }

   public void setPercImpostoSven(BigDecimal percImpostoSven) {
        markAsChanged("PERCIMPOSTOSVEN", percImpostoSven);
        this.percImpostoSven = percImpostoSven;
   }

   public BigDecimal getCodMoeda() {
        return codMoeda;
   }

   public void setCodMoeda(BigDecimal codMoeda) {
        markAsChanged("CODMOEDA", codMoeda);
        this.codMoeda = codMoeda;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtProjeto() {
        return dtProjeto;
   }

   public void setDtProjeto(Timestamp dtProjeto) {
        markAsChanged("DTPROJETO", dtProjeto);
        this.dtProjeto = dtProjeto;
   }

   public String getDupNovaVersao() {
        return dupNovaVersao;
   }

   public void setDupNovaVersao(String dupNovaVersao) {
        markAsChanged("DUPNOVAVERSAO", dupNovaVersao);
        this.dupNovaVersao = dupNovaVersao;
   }

   public BigDecimal getPercInternacao() {
        return percInternacao;
   }

   public void setPercInternacao(BigDecimal percInternacao) {
        markAsChanged("PERCINTERNACAO", percInternacao);
        this.percInternacao = percInternacao;
   }

   public BigDecimal getPercInternacaoProd() {
        return percInternacaoProd;
   }

   public void setPercInternacaoProd(BigDecimal percInternacaoProd) {
        markAsChanged("PERCINTERNACAOPROD", percInternacaoProd);
        this.percInternacaoProd = percInternacaoProd;
   }

   public BigDecimal getPercInternacaoServ() {
        return percInternacaoServ;
   }

   public void setPercInternacaoServ(BigDecimal percInternacaoServ) {
        markAsChanged("PERCINTERNACAOSERV", percInternacaoServ);
        this.percInternacaoServ = percInternacaoServ;
   }

   public BigDecimal getPercLucroLiquido() {
        return percLucroLiquido;
   }

   public void setPercLucroLiquido(BigDecimal percLucroLiquido) {
        markAsChanged("PERCLUCROLIQUIDO", percLucroLiquido);
        this.percLucroLiquido = percLucroLiquido;
   }

   public BigDecimal getPercMargemProd() {
        return percMargemProd;
   }

   public void setPercMargemProd(BigDecimal percMargemProd) {
        markAsChanged("PERCMARGEMPROD", percMargemProd);
        this.percMargemProd = percMargemProd;
   }

   public BigDecimal getPercMargemProp() {
        return percMargemProp;
   }

   public void setPercMargemProp(BigDecimal percMargemProp) {
        markAsChanged("PERCMARGEMPROP", percMargemProp);
        this.percMargemProp = percMargemProp;
   }

   public BigDecimal getPercMargemServ() {
        return percMargemServ;
   }

   public void setPercMargemServ(BigDecimal percMargemServ) {
        markAsChanged("PERCMARGEMSERV", percMargemServ);
        this.percMargemServ = percMargemServ;
   }

   public String getVersaoProjeto() {
        return versaoProjeto;
   }

   public void setVersaoProjeto(String versaoProjeto) {
        markAsChanged("VERSAOPROJETO", versaoProjeto);
        this.versaoProjeto = versaoProjeto;
   }

   public BigDecimal getVlrCusEquipCif() {
        return vlrCusEquipCif;
   }

   public void setVlrCusEquipCif(BigDecimal vlrCusEquipCif) {
        markAsChanged("VLRCUSEQUIPCIF", vlrCusEquipCif);
        this.vlrCusEquipCif = vlrCusEquipCif;
   }

   public BigDecimal getVlrCusEquipFob() {
        return vlrCusEquipFob;
   }

   public void setVlrCusEquipFob(BigDecimal vlrCusEquipFob) {
        markAsChanged("VLRCUSEQUIPFOB", vlrCusEquipFob);
        this.vlrCusEquipFob = vlrCusEquipFob;
   }

   public BigDecimal getVlrCusEquipMargem() {
        return vlrCusEquipMargem;
   }

   public void setVlrCusEquipMargem(BigDecimal vlrCusEquipMargem) {
        markAsChanged("VLRCUSEQUIPMARGEM", vlrCusEquipMargem);
        this.vlrCusEquipMargem = vlrCusEquipMargem;
   }

   public BigDecimal getVlrDesconto() {
        return vlrDesconto;
   }

   public void setVlrDesconto(BigDecimal vlrDesconto) {
        markAsChanged("VLRDESCONTO", vlrDesconto);
        this.vlrDesconto = vlrDesconto;
   }

   public BigDecimal getVlrGarantiaTecnico() {
        return vlrGarantiaTecnico;
   }

   public void setVlrGarantiaTecnico(BigDecimal vlrGarantiaTecnico) {
        markAsChanged("VLRGARANTIATECNICO", vlrGarantiaTecnico);
        this.vlrGarantiaTecnico = vlrGarantiaTecnico;
   }

   public BigDecimal getVlrGarHardCif() {
        return vlrGarHardCif;
   }

   public void setVlrGarHardCif(BigDecimal vlrGarHardCif) {
        markAsChanged("VLRGARHARDCIF", vlrGarHardCif);
        this.vlrGarHardCif = vlrGarHardCif;
   }

   public BigDecimal getVlrGarHardFob() {
        return vlrGarHardFob;
   }

   public void setVlrGarHardFob(BigDecimal vlrGarHardFob) {
        markAsChanged("VLRGARHARDFOB", vlrGarHardFob);
        this.vlrGarHardFob = vlrGarHardFob;
   }

   public BigDecimal getVlrGarHardMargem() {
        return vlrGarHardMargem;
   }

   public void setVlrGarHardMargem(BigDecimal vlrGarHardMargem) {
        markAsChanged("VLRGARHARDMARGEM", vlrGarHardMargem);
        this.vlrGarHardMargem = vlrGarHardMargem;
   }

   public BigDecimal getVlrGarSoftCif() {
        return vlrGarSoftCif;
   }

   public void setVlrGarSoftCif(BigDecimal vlrGarSoftCif) {
        markAsChanged("VLRGARSOFTCIF", vlrGarSoftCif);
        this.vlrGarSoftCif = vlrGarSoftCif;
   }

   public BigDecimal getVlrGarSoftFob() {
        return vlrGarSoftFob;
   }

   public void setVlrGarSoftFob(BigDecimal vlrGarSoftFob) {
        markAsChanged("VLRGARSOFTFOB", vlrGarSoftFob);
        this.vlrGarSoftFob = vlrGarSoftFob;
   }

   public BigDecimal getVlrGarSoftMargem() {
        return vlrGarSoftMargem;
   }

   public void setVlrGarSoftMargem(BigDecimal vlrGarSoftMargem) {
        markAsChanged("VLRGARSOFTMARGEM", vlrGarSoftMargem);
        this.vlrGarSoftMargem = vlrGarSoftMargem;
   }

   public BigDecimal getVlrImpostoSven() {
        return vlrImpostoSven;
   }

   public void setVlrImpostoSven(BigDecimal vlrImpostoSven) {
        markAsChanged("VLRIMPOSTOSVEN", vlrImpostoSven);
        this.vlrImpostoSven = vlrImpostoSven;
   }

   public BigDecimal getVlrInstalacao() {
        return vlrInstalacao;
   }

   public void setVlrInstalacao(BigDecimal vlrInstalacao) {
        markAsChanged("VLRINSTALACAO", vlrInstalacao);
        this.vlrInstalacao = vlrInstalacao;
   }

   public BigDecimal getVlrInternacao() {
        return vlrInternacao;
   }

   public void setVlrInternacao(BigDecimal vlrInternacao) {
        markAsChanged("VLRINTERNACAO", vlrInternacao);
        this.vlrInternacao = vlrInternacao;
   }

   public BigDecimal getVlrLucroLiquidoReal() {
        return vlrLucroLiquidoReal;
   }

   public void setVlrLucroLiquidoReal(BigDecimal vlrLucroLiquidoReal) {
        markAsChanged("VLRLUCROLIQUIDOREAL", vlrLucroLiquidoReal);
        this.vlrLucroLiquidoReal = vlrLucroLiquidoReal;
   }

   public BigDecimal getVlrMargemProp() {
        return vlrMargemProp;
   }

   public void setVlrMargemProp(BigDecimal vlrMargemProp) {
        markAsChanged("VLRMARGEMPROP", vlrMargemProp);
        this.vlrMargemProp = vlrMargemProp;
   }

   public BigDecimal getVlrMoeda() {
        return vlrMoeda;
   }

   public void setVlrMoeda(BigDecimal vlrMoeda) {
        markAsChanged("VLRMOEDA", vlrMoeda);
        this.vlrMoeda = vlrMoeda;
   }

   public BigDecimal getVlrOutrosCusCif() {
        return vlrOutrosCusCif;
   }

   public void setVlrOutrosCusCif(BigDecimal vlrOutrosCusCif) {
        markAsChanged("VLROUTROSCUSCIF", vlrOutrosCusCif);
        this.vlrOutrosCusCif = vlrOutrosCusCif;
   }

   public BigDecimal getVlrOutrosCusMargem() {
        return vlrOutrosCusMargem;
   }

   public void setVlrOutrosCusMargem(BigDecimal vlrOutrosCusMargem) {
        markAsChanged("VLROUTROSCUSMARGEM", vlrOutrosCusMargem);
        this.vlrOutrosCusMargem = vlrOutrosCusMargem;
   }

   public BigDecimal getVlrTotal() {
        return vlrTotal;
   }

   public void setVlrTotal(BigDecimal vlrTotal) {
        markAsChanged("VLRTOTAL", vlrTotal);
        this.vlrTotal = vlrTotal;
   }

   public BigDecimal getVlrTotalArredondado() {
        return vlrTotalArredondado;
   }

   public void setVlrTotalArredondado(BigDecimal vlrTotalArredondado) {
        markAsChanged("VLRTOTALARREDONDADO", vlrTotalArredondado);
        this.vlrTotalArredondado = vlrTotalArredondado;
   }

   public BigDecimal getVlrTotalCif() {
        return vlrTotalCif;
   }

   public void setVlrTotalCif(BigDecimal vlrTotalCif) {
        markAsChanged("VLRTOTALCIF", vlrTotalCif);
        this.vlrTotalCif = vlrTotalCif;
   }

   public BigDecimal getVlrTotalComissao() {
        return vlrTotalComissao;
   }

   public void setVlrTotalComissao(BigDecimal vlrTotalComissao) {
        markAsChanged("VLRTOTALCOMISSAO", vlrTotalComissao);
        this.vlrTotalComissao = vlrTotalComissao;
   }

   public BigDecimal getVlrTotalComSpare() {
        return vlrTotalComSpare;
   }

   public void setVlrTotalComSpare(BigDecimal vlrTotalComSpare) {
        markAsChanged("VLRTOTALCOMSPARE", vlrTotalComSpare);
        this.vlrTotalComSpare = vlrTotalComSpare;
   }

   public BigDecimal getVlrTotalCus() {
        return vlrTotalCus;
   }

   public void setVlrTotalCus(BigDecimal vlrTotalCus) {
        markAsChanged("VLRTOTALCUS", vlrTotalCus);
        this.vlrTotalCus = vlrTotalCus;
   }

   public BigDecimal getVlrTotalFob() {
        return vlrTotalFob;
   }

   public void setVlrTotalFob(BigDecimal vlrTotalFob) {
        markAsChanged("VLRTOTALFOB", vlrTotalFob);
        this.vlrTotalFob = vlrTotalFob;
   }

   public BigDecimal getVlrTotalReal() {
        return vlrTotalReal;
   }

   public void setVlrTotalReal(BigDecimal vlrTotalReal) {
        markAsChanged("VLRTOTALREAL", vlrTotalReal);
        this.vlrTotalReal = vlrTotalReal;
   }

   public BigDecimal getVlrTreinamento() {
        return vlrTreinamento;
   }

   public void setVlrTreinamento(BigDecimal vlrTreinamento) {
        markAsChanged("VLRTREINAMENTO", vlrTreinamento);
        this.vlrTreinamento = vlrTreinamento;
   }

   public BigDecimal getVlrViagemInt() {
        return vlrViagemInt;
   }

   public void setVlrViagemInt(BigDecimal vlrViagemInt) {
        markAsChanged("VLRVIAGEMINT", vlrViagemInt);
        this.vlrViagemInt = vlrViagemInt;
   }

   public BigDecimal getVlrViagemNac() {
        return vlrViagemNac;
   }

   public void setVlrViagemNac(BigDecimal vlrViagemNac) {
        markAsChanged("VLRVIAGEMNAC", vlrViagemNac);
        this.vlrViagemNac = vlrViagemNac;
   }

   public String getNomeProj() {
        return nomeProj;
   }

   public void setNomeProj(String nomeProj) {
        markAsChanged("NOMEPROJ", nomeProj);
        this.nomeProj = nomeProj;
   }

   public BigDecimal getNuProjeto() {
        return nuProjeto;
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        markAsChanged("NUPROJETO", nuProjeto);
        this.nuProjeto = nuProjeto;
   }

   public char[] getObs() {
        return obs;
   }

   public void setObs(char[] obs) {
        markAsChanged("OBS", obs);
        this.obs = obs;
   }

   public BigDecimal getPercComissao1() {
        return percComissao1;
   }

   public void setPercComissao1(BigDecimal percComissao1) {
        markAsChanged("PERCCOMISSAO1", percComissao1);
        this.percComissao1 = percComissao1;
   }

   public BigDecimal getPercComissao2() {
        return percComissao2;
   }

   public void setPercComissao2(BigDecimal percComissao2) {
        markAsChanged("PERCCOMISSAO2", percComissao2);
        this.percComissao2 = percComissao2;
   }

   public BigDecimal getPercComissao3() {
        return percComissao3;
   }

   public void setPercComissao3(BigDecimal percComissao3) {
        markAsChanged("PERCCOMISSAO3", percComissao3);
        this.percComissao3 = percComissao3;
   }

   public BigDecimal getPercComissao4() {
        return percComissao4;
   }

   public void setPercComissao4(BigDecimal percComissao4) {
        markAsChanged("PERCCOMISSAO4", percComissao4);
        this.percComissao4 = percComissao4;
   }

   public BigDecimal getPercComissao5() {
        return percComissao5;
   }

   public void setPercComissao5(BigDecimal percComissao5) {
        markAsChanged("PERCCOMISSAO5", percComissao5);
        this.percComissao5 = percComissao5;
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
        this.setOriginalVO(vo);
        this.percDesconto = vo.asBigDecimal("PERCDESCONTO");
        this.percDescProd = vo.asBigDecimal("PERCDESCPROD");
        this.percDescServ = vo.asBigDecimal("PERCDESCSERV");
        this.percFrete = vo.asBigDecimal("PERCFRETE");
        this.percImpostoProd = vo.asBigDecimal("PERCIMPOSTOPROD");
        this.percImpostoServ = vo.asBigDecimal("PERCIMPOSTOSERV");
        this.percImpostoSven = vo.asBigDecimal("PERCIMPOSTOSVEN");
        this.codMoeda = vo.asBigDecimal("CODMOEDA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtProjeto = vo.asTimestamp("DTPROJETO");
        this.dupNovaVersao = vo.asString("DUPNOVAVERSAO");
        this.percInternacao = vo.asBigDecimal("PERCINTERNACAO");
        this.percInternacaoProd = vo.asBigDecimal("PERCINTERNACAOPROD");
        this.percInternacaoServ = vo.asBigDecimal("PERCINTERNACAOSERV");
        this.percLucroLiquido = vo.asBigDecimal("PERCLUCROLIQUIDO");
        this.percMargemProd = vo.asBigDecimal("PERCMARGEMPROD");
        this.percMargemProp = vo.asBigDecimal("PERCMARGEMPROP");
        this.percMargemServ = vo.asBigDecimal("PERCMARGEMSERV");
        this.versaoProjeto = vo.asString("VERSAOPROJETO");
        this.vlrCusEquipCif = vo.asBigDecimal("VLRCUSEQUIPCIF");
        this.vlrCusEquipFob = vo.asBigDecimal("VLRCUSEQUIPFOB");
        this.vlrCusEquipMargem = vo.asBigDecimal("VLRCUSEQUIPMARGEM");
        this.vlrDesconto = vo.asBigDecimal("VLRDESCONTO");
        this.vlrGarantiaTecnico = vo.asBigDecimal("VLRGARANTIATECNICO");
        this.vlrGarHardCif = vo.asBigDecimal("VLRGARHARDCIF");
        this.vlrGarHardFob = vo.asBigDecimal("VLRGARHARDFOB");
        this.vlrGarHardMargem = vo.asBigDecimal("VLRGARHARDMARGEM");
        this.vlrGarSoftCif = vo.asBigDecimal("VLRGARSOFTCIF");
        this.vlrGarSoftFob = vo.asBigDecimal("VLRGARSOFTFOB");
        this.vlrGarSoftMargem = vo.asBigDecimal("VLRGARSOFTMARGEM");
        this.vlrImpostoSven = vo.asBigDecimal("VLRIMPOSTOSVEN");
        this.vlrInstalacao = vo.asBigDecimal("VLRINSTALACAO");
        this.vlrInternacao = vo.asBigDecimal("VLRINTERNACAO");
        this.vlrLucroLiquidoReal = vo.asBigDecimal("VLRLUCROLIQUIDOREAL");
        this.vlrMargemProp = vo.asBigDecimal("VLRMARGEMPROP");
        this.vlrMoeda = vo.asBigDecimal("VLRMOEDA");
        this.vlrOutrosCusCif = vo.asBigDecimal("VLROUTROSCUSCIF");
        this.vlrOutrosCusMargem = vo.asBigDecimal("VLROUTROSCUSMARGEM");
        this.vlrTotal = vo.asBigDecimal("VLRTOTAL");
        this.vlrTotalArredondado = vo.asBigDecimal("VLRTOTALARREDONDADO");
        this.vlrTotalCif = vo.asBigDecimal("VLRTOTALCIF");
        this.vlrTotalComissao = vo.asBigDecimal("VLRTOTALCOMISSAO");
        this.vlrTotalComSpare = vo.asBigDecimal("VLRTOTALCOMSPARE");
        this.vlrTotalCus = vo.asBigDecimal("VLRTOTALCUS");
        this.vlrTotalFob = vo.asBigDecimal("VLRTOTALFOB");
        this.vlrTotalReal = vo.asBigDecimal("VLRTOTALREAL");
        this.vlrTreinamento = vo.asBigDecimal("VLRTREINAMENTO");
        this.vlrViagemInt = vo.asBigDecimal("VLRVIAGEMINT");
        this.vlrViagemNac = vo.asBigDecimal("VLRVIAGEMNAC");
        this.nomeProj = vo.asString("NOMEPROJ");
        this.nuProjeto = vo.asBigDecimal("NUPROJETO");
        this.obs = vo.asClob("OBS");
        this.percComissao1 = vo.asBigDecimal("PERCCOMISSAO1");
        this.percComissao2 = vo.asBigDecimal("PERCCOMISSAO2");
        this.percComissao3 = vo.asBigDecimal("PERCCOMISSAO3");
        this.percComissao4 = vo.asBigDecimal("PERCCOMISSAO4");
        this.percComissao5 = vo.asBigDecimal("PERCCOMISSAO5");
        return this;
   }
}
