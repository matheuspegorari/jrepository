package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EmpresaPessoal extends AbstractSankhyaEntity<EmpresaPessoal> {
   public String getSocioOstensivo() {
        return this.getVo().asString("SOCIOOSTENSIVO");
   }

   public void setSocioOstensivo(String socioOstensivo) {
        markAsChanged("SOCIOOSTENSIVO", socioOstensivo);
   }

   public String getSugereDatPag() {
        return this.getVo().asString("SUGEREDATPAG");
   }

   public void setSugereDatPag(String sugereDatPag) {
        markAsChanged("SUGEREDATPAG", sugereDatPag);
   }

   public String getTipDiaPag() {
        return this.getVo().asString("TIPDIAPAG");
   }

   public void setTipDiaPag(String tipDiaPag) {
        markAsChanged("TIPDIAPAG", tipDiaPag);
   }

   public BigDecimal getTipEventoEsp() {
        return this.getVo().asBigDecimal("TIPEVENTOESP");
   }

   public void setTipEventoEsp(BigDecimal tipEventoEsp) {
        markAsChanged("TIPEVENTOESP", tipEventoEsp);
   }

   public String getAlterouEnd() {
        return this.getVo().asString("ALTEROUEND");
   }

   public void setAlterouEnd(String alterouEnd) {
        markAsChanged("ALTEROUEND", alterouEnd);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCategFgts() {
        return this.getVo().asBigDecimal("CATEGFGTS");
   }

   public void setCategFgts(BigDecimal categFgts) {
        markAsChanged("CATEGFGTS", categFgts);
   }

   public String getCentralizadora() {
        return this.getVo().asString("CENTRALIZADORA");
   }

   public void setCentralizadora(String centralizadora) {
        markAsChanged("CENTRALIZADORA", centralizadora);
   }

   public String getCgcAnt() {
        return this.getVo().asString("CGCANT");
   }

   public void setCgcAnt(String cgcAnt) {
        markAsChanged("CGCANT", cgcAnt);
   }

   public String getCgcSindPatronal() {
        return this.getVo().asString("CGCSINDPATRONAL");
   }

   public void setCgcSindPatronal(String cgcSindPatronal) {
        markAsChanged("CGCSINDPATRONAL", cgcSindPatronal);
   }

   public String getClubeInvest() {
        return this.getVo().asString("CLUBEINVEST");
   }

   public void setClubeInvest(String clubeInvest) {
        markAsChanged("CLUBEINVEST", clubeInvest);
   }

   public BigDecimal getCodCenCus() {
        return this.getVo().asBigDecimal("CODCENCUS");
   }

   public void setCodCenCus(BigDecimal codCenCus) {
        markAsChanged("CODCENCUS", codCenCus);
   }

   public BigDecimal getCodCtabCoint() {
        return this.getVo().asBigDecimal("CODCTABCOINT");
   }

   public void setCodCtabCoint(BigDecimal codCtabCoint) {
        markAsChanged("CODCTABCOINT", codCtabCoint);
   }

   public BigDecimal getCodCtactbRever13() {
        return this.getVo().asBigDecimal("CODCTACTBREVER13");
   }

   public void setCodCtactbRever13(BigDecimal codCtactbRever13) {
        markAsChanged("CODCTACTBREVER13", codCtactbRever13);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodEmpModHol() {
        return this.getVo().asBigDecimal("CODEMPMODHOL");
   }

   public void setCodEmpModHol(BigDecimal codEmpModHol) {
        markAsChanged("CODEMPMODHOL", codEmpModHol);
   }

   public BigDecimal getCodEmpOrg() {
        return this.getVo().asBigDecimal("CODEMPORG");
   }

   public void setCodEmpOrg(BigDecimal codEmpOrg) {
        markAsChanged("CODEMPORG", codEmpOrg);
   }

   public BigDecimal getCodHistCtbRever13() {
        return this.getVo().asBigDecimal("CODHISTCTBREVER13");
   }

   public void setCodHistCtbRever13(BigDecimal codHistCtbRever13) {
        markAsChanged("CODHISTCTBREVER13", codHistCtbRever13);
   }

   public BigDecimal getCodPref() {
        return this.getVo().asBigDecimal("CODPREF");
   }

   public void setCodPref(BigDecimal codPref) {
        markAsChanged("CODPREF", codPref);
   }

   public BigDecimal getCodRegFis() {
        return this.getVo().asBigDecimal("CODREGFIS");
   }

   public void setCodRegFis(BigDecimal codRegFis) {
        markAsChanged("CODREGFIS", codRegFis);
   }

   public String getCpfRespCnpj() {
        return this.getVo().asString("CPFRESPCNPJ");
   }

   public void setCpfRespCnpj(String cpfRespCnpj) {
        markAsChanged("CPFRESPCNPJ", cpfRespCnpj);
   }

   public BigDecimal getCtaCtbReverSao() {
        return this.getVo().asBigDecimal("CTACTBREVERSAO");
   }

   public void setCtaCtbReverSao(BigDecimal ctaCtbReverSao) {
        markAsChanged("CTACTBREVERSAO", ctaCtbReverSao);
   }

   public BigDecimal getCtaFgts() {
        return this.getVo().asBigDecimal("CTAFGTS");
   }

   public void setCtaFgts(BigDecimal ctaFgts) {
        markAsChanged("CTAFGTS", ctaFgts);
   }

   public String getDepositoJud() {
        return this.getVo().asString("DEPOSITOJUD");
   }

   public void setDepositoJud(String depositoJud) {
        markAsChanged("DEPOSITOJUD", depositoJud);
   }

   public BigDecimal getDiaPagFerias() {
        return this.getVo().asBigDecimal("DIAPAGFERIAS");
   }

   public void setDiaPagFerias(BigDecimal diaPagFerias) {
        markAsChanged("DIAPAGFERIAS", diaPagFerias);
   }

   public BigDecimal getDiaPagMensal() {
        return this.getVo().asBigDecimal("DIAPAGMENSAL");
   }

   public void setDiaPagMensal(BigDecimal diaPagMensal) {
        markAsChanged("DIAPAGMENSAL", diaPagMensal);
   }

   public BigDecimal getDiaPagQuinz() {
        return this.getVo().asBigDecimal("DIAPAGQUINZ");
   }

   public void setDiaPagQuinz(BigDecimal diaPagQuinz) {
        markAsChanged("DIAPAGQUINZ", diaPagQuinz);
   }

   public BigDecimal getDiaPagQuinz2() {
        return this.getVo().asBigDecimal("DIAPAGQUINZ_2");
   }

   public void setDiaPagQuinz2(BigDecimal diaPagQuinz2) {
        markAsChanged("DIAPAGQUINZ_2", diaPagQuinz2);
   }

   public BigDecimal getDiaPagSem() {
        return this.getVo().asBigDecimal("DIAPAGSEM");
   }

   public void setDiaPagSem(BigDecimal diaPagSem) {
        markAsChanged("DIAPAGSEM", diaPagSem);
   }

   public String getDirfCpf() {
        return this.getVo().asString("DIRFCPF");
   }

   public void setDirfCpf(String dirfCpf) {
        markAsChanged("DIRFCPF", dirfCpf);
   }

   public String getDirfDdd() {
        return this.getVo().asString("DIRFDDD");
   }

   public void setDirfDdd(String dirfDdd) {
        markAsChanged("DIRFDDD", dirfDdd);
   }

   public String getDirfEmail() {
        return this.getVo().asString("DIRFEMAIL");
   }

   public void setDirfEmail(String dirfEmail) {
        markAsChanged("DIRFEMAIL", dirfEmail);
   }

   public String getDirfFax() {
        return this.getVo().asString("DIRFFAX");
   }

   public void setDirfFax(String dirfFax) {
        markAsChanged("DIRFFAX", dirfFax);
   }

   public String getDirfFone() {
        return this.getVo().asString("DIRFFONE");
   }

   public void setDirfFone(String dirfFone) {
        markAsChanged("DIRFFONE", dirfFone);
   }

   public String getDirfNome() {
        return this.getVo().asString("DIRFNOME");
   }

   public void setDirfNome(String dirfNome) {
        markAsChanged("DIRFNOME", dirfNome);
   }

   public String getDirfRamal() {
        return this.getVo().asString("DIRFRAMAL");
   }

   public void setDirfRamal(String dirfRamal) {
        markAsChanged("DIRFRAMAL", dirfRamal);
   }

   public Timestamp getDtAtual() {
        return this.getVo().asTimestamp("DTATUAL");
   }

   public void setDtAtual(Timestamp dtAtual) {
        markAsChanged("DTATUAL", dtAtual);
   }

   public Timestamp getDtEvento() {
        return this.getVo().asTimestamp("DTEVENTO");
   }

   public void setDtEvento(Timestamp dtEvento) {
        markAsChanged("DTEVENTO", dtEvento);
   }

   public String getEmAtividade() {
        return this.getVo().asString("EMATIVIDADE");
   }

   public void setEmAtividade(String emAtividade) {
        markAsChanged("EMATIVIDADE", emAtividade);
   }

   public BigDecimal getEmpDestinoCtb() {
        return this.getVo().asBigDecimal("EMPDESTINOCTB");
   }

   public void setEmpDestinoCtb(BigDecimal empDestinoCtb) {
        markAsChanged("EMPDESTINOCTB", empDestinoCtb);
   }

   public BigDecimal getEmpDestinoGrelha() {
        return this.getVo().asBigDecimal("EMPDESTINOGRELHA");
   }

   public void setEmpDestinoGrelha(BigDecimal empDestinoGrelha) {
        markAsChanged("EMPDESTINOGRELHA", empDestinoGrelha);
   }

   public String getGeraMatricula() {
        return this.getVo().asString("GERAMATRICULA");
   }

   public void setGeraMatricula(String geraMatricula) {
        markAsChanged("GERAMATRICULA", geraMatricula);
   }

   public BigDecimal getHistCtbReverSao() {
        return this.getVo().asBigDecimal("HISTCTBREVERSAO");
   }

   public void setHistCtbReverSao(BigDecimal histCtbReverSao) {
        markAsChanged("HISTCTBREVERSAO", histCtbReverSao);
   }

   public BigDecimal getMesDissidio() {
        return this.getVo().asBigDecimal("MESDISSIDIO");
   }

   public void setMesDissidio(BigDecimal mesDissidio) {
        markAsChanged("MESDISSIDIO", mesDissidio);
   }

   public BigDecimal getModHollerit() {
        return this.getVo().asBigDecimal("MODHOLLERIT");
   }

   public void setModHollerit(BigDecimal modHollerit) {
        markAsChanged("MODHOLLERIT", modHollerit);
   }

   public BigDecimal getNumConvInt() {
        return this.getVo().asBigDecimal("NUMCONVINT");
   }

   public void setNumConvInt(BigDecimal numConvInt) {
        markAsChanged("NUMCONVINT", numConvInt);
   }

   public String getPagaExterior() {
        return this.getVo().asString("PAGAEXTERIOR");
   }

   public void setPagaExterior(String pagaExterior) {
        markAsChanged("PAGAEXTERIOR", pagaExterior);
   }

   public BigDecimal getPercAlimConv() {
        return this.getVo().asBigDecimal("PERCALIMCONV");
   }

   public void setPercAlimConv(BigDecimal percAlimConv) {
        markAsChanged("PERCALIMCONV", percAlimConv);
   }

   public BigDecimal getPercCestAlim() {
        return this.getVo().asBigDecimal("PERCCESTALIM");
   }

   public void setPercCestAlim(BigDecimal percCestAlim) {
        markAsChanged("PERCCESTALIM", percCestAlim);
   }

   public BigDecimal getVlrConfederativa() {
        return this.getVo().asBigDecimal("VLRCONFEDERATIVA");
   }

   public void setVlrConfederativa(BigDecimal vlrConfederativa) {
        markAsChanged("VLRCONFEDERATIVA", vlrConfederativa);
   }

   public BigDecimal getVlrSindical() {
        return this.getVo().asBigDecimal("VLRSINDICAL");
   }

   public void setVlrSindical(BigDecimal vlrSindical) {
        markAsChanged("VLRSINDICAL", vlrSindical);
   }

   public BigDecimal getPercServico() {
        return this.getVo().asBigDecimal("PERCSERVICO");
   }

   public void setPercServico(BigDecimal percServico) {
        markAsChanged("PERCSERVICO", percServico);
   }

   public BigDecimal getPercTranspo() {
        return this.getVo().asBigDecimal("PERCTRANSPO");
   }

   public void setPercTranspo(BigDecimal percTranspo) {
        markAsChanged("PERCTRANSPO", percTranspo);
   }

   public BigDecimal getPorte() {
        return this.getVo().asBigDecimal("PORTE");
   }

   public void setPorte(BigDecimal porte) {
        markAsChanged("PORTE", porte);
   }

   public String getProgAlimTrab() {
        return this.getVo().asString("PROGALIMTRAB");
   }

   public void setProgAlimTrab(String progAlimTrab) {
        markAsChanged("PROGALIMTRAB", progAlimTrab);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public String getSindicalizada() {
        return this.getVo().asString("SINDICALIZADA");
   }

   public void setSindicalizada(String sindicalizada) {
        markAsChanged("SINDICALIZADA", sindicalizada);
   }

   public String getSituacaoEsp() {
        return this.getVo().asString("SITUACAOESP");
   }

   public void setSituacaoEsp(String situacaoEsp) {
        markAsChanged("SITUACAOESP", situacaoEsp);
   }

   public BigDecimal getPercCozinha() {
        return this.getVo().asBigDecimal("PERCCOZINHA");
   }

   public void setPercCozinha(BigDecimal percCozinha) {
        markAsChanged("PERCCOZINHA", percCozinha);
   }

   public BigDecimal getPercRefeicao() {
        return this.getVo().asBigDecimal("PERCREFEICAO");
   }

   public void setPercRefeicao(BigDecimal percRefeicao) {
        markAsChanged("PERCREFEICAO", percRefeicao);
   }

   public BigDecimal getVlrAssistencial() {
        return this.getVo().asBigDecimal("VLRASSISTENCIAL");
   }

   public void setVlrAssistencial(BigDecimal vlrAssistencial) {
        markAsChanged("VLRASSISTENCIAL", vlrAssistencial);
   }

   public BigDecimal getVlrAssociativa() {
        return this.getVo().asBigDecimal("VLRASSOCIATIVA");
   }

   public void setVlrAssociativa(BigDecimal vlrAssociativa) {
        markAsChanged("VLRASSOCIATIVA", vlrAssociativa);
   }

   public String getInibePonto() {
        return this.getVo().asString("INIBEPONTO");
   }

   public void setInibePonto(String inibePonto) {
        markAsChanged("INIBEPONTO", inibePonto);
   }

   public BigDecimal getModPonto() {
        return this.getVo().asBigDecimal("MODPONTO");
   }

   public void setModPonto(BigDecimal modPonto) {
        markAsChanged("MODPONTO", modPonto);
   }

   public String getArqModEmail() {
        return this.getVo().asString("ARQMODEMAIL");
   }

   public void setArqModEmail(String arqModEmail) {
        markAsChanged("ARQMODEMAIL", arqModEmail);
   }

   public String getImpPortalRh() {
        return this.getVo().asString("IMPPORTALRH");
   }

   public void setImpPortalRh(String impPortalRh) {
        markAsChanged("IMPPORTALRH", impPortalRh);
   }

   public String getInibeHollerit() {
        return this.getVo().asString("INIBEHOLLERIT");
   }

   public void setInibeHollerit(String inibeHollerit) {
        markAsChanged("INIBEHOLLERIT", inibeHollerit);
   }

   public String getPortalApto() {
        return this.getVo().asString("PORTALAPONTO");
   }

   public void setPortalApto(String portalApto) {
        markAsChanged("PORTALAPONTO", portalApto);
   }

   public String getPortalEvolucao() {
        return this.getVo().asString("PORTALEVOLUCAO");
   }

   public void setPortalEvolucao(String portalEvolucao) {
        markAsChanged("PORTALEVOLUCAO", portalEvolucao);
   }

   public String getPortalProgFerias() {
        return this.getVo().asString("PORTALPROGFERIAS");
   }

   public void setPortalProgFerias(String portalProgFerias) {
        markAsChanged("PORTALPROGFERIAS", portalProgFerias);
   }

   public String getImportaPonto() {
        return this.getVo().asString("IMPORTAPONTO");
   }

   public void setImportaPonto(String importaPonto) {
        markAsChanged("IMPORTAPONTO", importaPonto);
   }

   public BigDecimal getIndDesfolha() {
        return this.getVo().asBigDecimal("INDDESFOLHA");
   }

   public void setIndDesfolha(BigDecimal indDesfolha) {
        markAsChanged("INDDESFOLHA", indDesfolha);
   }

   public String getIndEnted() {
        return this.getVo().asString("INDENTED");
   }

   public void setIndEnted(String indEnted) {
        markAsChanged("INDENTED", indEnted);
   }

   public String getIndEtt() {
        return this.getVo().asString("INDETT");
   }

   public void setIndEtt(String indEtt) {
        markAsChanged("INDETT", indEtt);
   }

   public BigDecimal getIndOptRegEletron() {
        return this.getVo().asBigDecimal("INDOPTREGELETRON");
   }

   public void setIndOptRegEletron(BigDecimal indOptRegEletron) {
        markAsChanged("INDOPTREGELETRON", indOptRegEletron);
   }

   public String getIndRpps() {
        return this.getVo().asString("INDRPPS");
   }

   public void setIndRpps(String indRpps) {
        markAsChanged("INDRPPS", indRpps);
   }

   public BigDecimal getIndSimples() {
        return this.getVo().asBigDecimal("INDSIMPLES");
   }

   public void setIndSimples(BigDecimal indSimples) {
        markAsChanged("INDSIMPLES", indSimples);
   }

   public BigDecimal getIndSitPj() {
        return this.getVo().asBigDecimal("INDSITPJ");
   }

   public void setIndSitPj(BigDecimal indSitPj) {
        markAsChanged("INDSITPJ", indSitPj);
   }

   public Timestamp getIniValSocial() {
        return this.getVo().asTimestamp("INIVALESOCIAL");
   }

   public void setIniValSocial(Timestamp iniValSocial) {
        markAsChanged("INIVALESOCIAL", iniValSocial);
   }

   public String getLogoFolha() {
        return this.getVo().asString("LOGOFOLHA");
   }

   public void setLogoFolha(String logoFolha) {
        markAsChanged("LOGOFOLHA", logoFolha);
   }

   public String getNmEnte() {
        return this.getVo().asString("NMENTE");
   }

   public void setNmEnte(String nmEnte) {
        markAsChanged("NMENTE", nmEnte);
   }

   public String getNroCertif() {
        return this.getVo().asString("NROCERTIF");
   }

   public void setNroCertif(String nroCertif) {
        markAsChanged("NROCERTIF", nroCertif);
   }

   public String getNroProtRenov() {
        return this.getVo().asString("NROPROTRENOV");
   }

   public void setNroProtRenov(String nroProtRenov) {
        markAsChanged("NROPROTRENOV", nroProtRenov);
   }

   public String getNrRegEtt() {
        return this.getVo().asString("NRREGETT");
   }

   public void setNrRegEtt(String nrRegEtt) {
        markAsChanged("NRREGETT", nrRegEtt);
   }

   public BigDecimal getNrSiafi() {
        return this.getVo().asBigDecimal("NRSIAFI");
   }

   public void setNrSiafi(BigDecimal nrSiafi) {
        markAsChanged("NRSIAFI", nrSiafi);
   }

   public BigDecimal getNuProcAltOutent() {
        return this.getVo().asBigDecimal("NUPROCALTOUTENT");
   }

   public void setNuProcAltOutent(BigDecimal nuProcAltOutent) {
        markAsChanged("NUPROCALTOUTENT", nuProcAltOutent);
   }

   public BigDecimal getNuProcessoApr() {
        return this.getVo().asBigDecimal("NUPROCESSOAPR");
   }

   public void setNuProcessoApr(BigDecimal nuProcessoApr) {
        markAsChanged("NUPROCESSOAPR", nuProcessoApr);
   }

   public BigDecimal getNuProcessoFap() {
        return this.getVo().asBigDecimal("NUPROCESSOFAP");
   }

   public void setNuProcessoFap(BigDecimal nuProcessoFap) {
        markAsChanged("NUPROCESSOFAP", nuProcessoFap);
   }

   public BigDecimal getNuProcessoPcd() {
        return this.getVo().asBigDecimal("NUPROCESSOPCD");
   }

   public void setNuProcessoPcd(BigDecimal nuProcessoPcd) {
        markAsChanged("NUPROCESSOPCD", nuProcessoPcd);
   }

   public BigDecimal getNuProcessoRat() {
        return this.getVo().asBigDecimal("NUPROCESSORAT");
   }

   public void setNuProcessoRat(BigDecimal nuProcessoRat) {
        markAsChanged("NUPROCESSORAT", nuProcessoRat);
   }

   public BigDecimal getPagDou() {
        return this.getVo().asBigDecimal("PAGDOU");
   }

   public void setPagDou(BigDecimal pagDou) {
        markAsChanged("PAGDOU", pagDou);
   }

   public String getPastaDoPonto() {
        return this.getVo().asString("PASTADOPONTO");
   }

   public void setPastaDoPonto(String pastaDoPonto) {
        markAsChanged("PASTADOPONTO", pastaDoPonto);
   }

   public BigDecimal getPercEnte() {
        return this.getVo().asBigDecimal("PERCENTE");
   }

   public void setPercEnte(BigDecimal percEnte) {
        markAsChanged("PERCENTE", percEnte);
   }

   public BigDecimal getPercSeg() {
        return this.getVo().asBigDecimal("PERCSEG");
   }

   public void setPercSeg(BigDecimal percSeg) {
        markAsChanged("PERCSEG", percSeg);
   }

   public BigDecimal getPercSupl() {
        return this.getVo().asBigDecimal("PERCSUPL");
   }

   public void setPercSupl(BigDecimal percSupl) {
        markAsChanged("PERCSUPL", percSupl);
   }

   public BigDecimal getPeriodoImpPonto() {
        return this.getVo().asBigDecimal("PERIODOIMPPONTO");
   }

   public void setPeriodoImpPonto(BigDecimal periodoImpPonto) {
        markAsChanged("PERIODOIMPPONTO", periodoImpPonto);
   }

   public String getReciboEsocial() {
        return this.getVo().asString("RECIBOESOCIAL");
   }

   public void setReciboEsocial(String reciboEsocial) {
        markAsChanged("RECIBOESOCIAL", reciboEsocial);
   }

   public String getRegimeRetirRfcx() {
        return this.getVo().asString("REGIMERETIRRFCX");
   }

   public void setRegimeRetirRfcx(String regimeRetirRfcx) {
        markAsChanged("REGIMERETIRRFCX", regimeRetirRfcx);
   }

   public String getSiglaMin() {
        return this.getVo().asString("SIGLAMIN");
   }

   public void setSiglaMin(String siglaMin) {
        markAsChanged("SIGLAMIN", siglaMin);
   }

   public BigDecimal getTipLotacao() {
        return this.getVo().asBigDecimal("TIPLOTACAO");
   }

   public void setTipLotacao(BigDecimal tipLotacao) {
        markAsChanged("TIPLOTACAO", tipLotacao);
   }

   public String getTipPonto() {
        return this.getVo().asString("TIPPONTO");
   }

   public void setTipPonto(String tipPonto) {
        markAsChanged("TIPPONTO", tipPonto);
   }

   public String getUsadoEsocial() {
        return this.getVo().asString("USADOESOCIAL");
   }

   public void setUsadoEsocial(String usadoEsocial) {
        markAsChanged("USADOESOCIAL", usadoEsocial);
   }

   public String getValidaBaseImp() {
        return this.getVo().asString("VALIDABASEIMP");
   }

   public void setValidaBaseImp(String validaBaseImp) {
        markAsChanged("VALIDABASEIMP", validaBaseImp);
   }

   public BigDecimal getValSubTeto() {
        return this.getVo().asBigDecimal("VALSUBTETO");
   }

   public void setValSubTeto(BigDecimal valSubTeto) {
        markAsChanged("VALSUBTETO", valSubTeto);
   }

   public String getJesPon() {
        return this.getVo().asString("JESPON");
   }

   public void setJesPon(String jesPon) {
        markAsChanged("JESPON", jesPon);
   }

   public BigDecimal getAliquotaFap() {
        return this.getVo().asBigDecimal("ALIQUOTAFAP");
   }

   public void setAliquotaFap(BigDecimal aliquotaFap) {
        markAsChanged("ALIQUOTAFAP", aliquotaFap);
   }

   public BigDecimal getAliquotaRat() {
        return this.getVo().asBigDecimal("ALIQUOTARAT");
   }

   public void setAliquotaRat(BigDecimal aliquotaRat) {
        markAsChanged("ALIQUOTARAT", aliquotaRat);
   }

   public String getCnpjEfr() {
        return this.getVo().asString("CNPJEFR");
   }

   public void setCnpjEfr(String cnpjEfr) {
        markAsChanged("CNPJEFR", cnpjEfr);
   }

   public String getCnpjProcurador() {
        return this.getVo().asString("CNPJPROCURADOR");
   }

   public void setCnpjProcurador(String cnpjProcurador) {
        markAsChanged("CNPJPROCURADOR", cnpjProcurador);
   }

   public BigDecimal getCodBcoFin() {
        return this.getVo().asBigDecimal("CODBCOFIN");
   }

   public void setCodBcoFin(BigDecimal codBcoFin) {
        markAsChanged("CODBCOFIN", codBcoFin);
   }

   public BigDecimal getCodCenCusAtoCoop() {
        return this.getVo().asBigDecimal("CODCENCUSATOCOOP");
   }

   public void setCodCenCusAtoCoop(BigDecimal codCenCusAtoCoop) {
        markAsChanged("CODCENCUSATOCOOP", codCenCusAtoCoop);
   }

   public BigDecimal getCodCtabCofin() {
        return this.getVo().asBigDecimal("CODCTABCOFIN");
   }

   public void setCodCtabCofin(BigDecimal codCtabCofin) {
        markAsChanged("CODCTABCOFIN", codCtabCofin);
   }

   public BigDecimal getCodEmpLotacao() {
        return this.getVo().asBigDecimal("CODEMPLOTACAO");
   }

   public void setCodEmpLotacao(BigDecimal codEmpLotacao) {
        markAsChanged("CODEMPLOTACAO", codEmpLotacao);
   }

   public BigDecimal getCodGrelha() {
        return this.getVo().asBigDecimal("CODGRELHA");
   }

   public void setCodGrelha(BigDecimal codGrelha) {
        markAsChanged("CODGRELHA", codGrelha);
   }

   public BigDecimal getCodInfFisc() {
        return this.getVo().asBigDecimal("CODINFFISC");
   }

   public void setCodInfFisc(BigDecimal codInfFisc) {
        markAsChanged("CODINFFISC", codInfFisc);
   }

   public BigDecimal getCodNatFpas() {
        return this.getVo().asBigDecimal("CODNATFPAS");
   }

   public void setCodNatFpas(BigDecimal codNatFpas) {
        markAsChanged("CODNATFPAS", codNatFpas);
   }

   public BigDecimal getCodNatSaldoRet() {
        return this.getVo().asBigDecimal("CODNATSALDORET");
   }

   public void setCodNatSaldoRet(BigDecimal codNatSaldoRet) {
        markAsChanged("CODNATSALDORET", codNatSaldoRet);
   }

   public BigDecimal getCodProjAtoCoop() {
        return this.getVo().asBigDecimal("CODPROJATOCOOP");
   }

   public void setCodProjAtoCoop(BigDecimal codProjAtoCoop) {
        markAsChanged("CODPROJATOCOOP", codProjAtoCoop);
   }

   public String getContaPr() {
        return this.getVo().asString("CONTAPR");
   }

   public void setContaPr(String contaPr) {
        markAsChanged("CONTAPR", contaPr);
   }

   public String getConteNted() {
        return this.getVo().asString("CONTENTED");
   }

   public void setConteNted(String conteNted) {
        markAsChanged("CONTENTED", conteNted);
   }

   public String getContPcd() {
        return this.getVo().asString("CONTPCD");
   }

   public void setContPcd(String contPcd) {
        markAsChanged("CONTPCD", contPcd);
   }

   public BigDecimal getControlePonto() {
        return this.getVo().asBigDecimal("CONTROLEPONTO");
   }

   public void setControlePonto(BigDecimal controlePonto) {
        markAsChanged("CONTROLEPONTO", controlePonto);
   }

   public String getCpfProdrural() {
        return this.getVo().asString("CPFPRODRURAL");
   }

   public void setCpfProdrural(String cpfProdrural) {
        markAsChanged("CPFPRODRURAL", cpfProdrural);
   }

   public BigDecimal getCtaCtbCrAtoCoop() {
        return this.getVo().asBigDecimal("CTACTBCRATOCOOP");
   }

   public void setCtaCtbCrAtoCoop(BigDecimal ctaCtbCrAtoCoop) {
        markAsChanged("CTACTBCRATOCOOP", ctaCtbCrAtoCoop);
   }

   public BigDecimal getCtaCtbDbAtoCoop() {
        return this.getVo().asBigDecimal("CTACTBDBATOCOOP");
   }

   public void setCtaCtbDbAtoCoop(BigDecimal ctaCtbDbAtoCoop) {
        markAsChanged("CTACTBDBATOCOOP", ctaCtbDbAtoCoop);
   }

   public Timestamp getDhUltimaImpPto() {
        return this.getVo().asTimestamp("DHULTIMAIMPPTO");
   }

   public void setDhUltimaImpPto(Timestamp dhUltimaImpPto) {
        markAsChanged("DHULTIMAIMPPTO", dhUltimaImpPto);
   }

   public BigDecimal getDiaApuraPonto() {
        return this.getVo().asBigDecimal("DIAAPURAPONTO");
   }

   public void setDiaApuraPonto(BigDecimal diaApuraPonto) {
        markAsChanged("DIAAPURAPONTO", diaApuraPonto);
   }

   public Timestamp getDtCargaInicial() {
        return this.getVo().asTimestamp("DTCARGAINICIAL");
   }

   public void setDtCargaInicial(Timestamp dtCargaInicial) {
        markAsChanged("DTCARGAINICIAL", dtCargaInicial);
   }

   public Timestamp getDtDou() {
        return this.getVo().asTimestamp("DTDOU");
   }

   public void setDtDou(Timestamp dtDou) {
        markAsChanged("DTDOU", dtDou);
   }

   public Timestamp getDtEmiCertif() {
        return this.getVo().asTimestamp("DTEMICERTIF");
   }

   public void setDtEmiCertif(Timestamp dtEmiCertif) {
        markAsChanged("DTEMICERTIF", dtEmiCertif);
   }

   public Timestamp getDtIncEsocial() {
        return this.getVo().asTimestamp("DTINC_ESOCIAL");
   }

   public void setDtIncEsocial(Timestamp dtIncEsocial) {
        markAsChanged("DTINC_ESOCIAL", dtIncEsocial);
   }

   public Timestamp getDtInicioEsocial() {
        return this.getVo().asTimestamp("DTINICIOESOCIAL");
   }

   public void setDtInicioEsocial(Timestamp dtInicioEsocial) {
        markAsChanged("DTINICIOESOCIAL", dtInicioEsocial);
   }

   public Timestamp getDtProtRenov() {
        return this.getVo().asTimestamp("DTPROTRENOV");
   }

   public void setDtProtRenov(Timestamp dtProtRenov) {
        markAsChanged("DTPROTRENOV", dtProtRenov);
   }

   public Timestamp getDtSesmt() {
        return this.getVo().asTimestamp("DTSESMT");
   }

   public void setDtSesmt(Timestamp dtSesmt) {
        markAsChanged("DTSESMT", dtSesmt);
   }

   public Timestamp getDtTerceiraFase() {
        return this.getVo().asTimestamp("DTTERCEIRAFASE");
   }

   public void setDtTerceiraFase(Timestamp dtTerceiraFase) {
        markAsChanged("DTTERCEIRAFASE", dtTerceiraFase);
   }

   public Timestamp getDtUltEnvEsocial() {
        return this.getVo().asTimestamp("DTULTENV_ESOCIAL");
   }

   public void setDtUltEnvEsocial(Timestamp dtUltEnvEsocial) {
        markAsChanged("DTULTENV_ESOCIAL", dtUltEnvEsocial);
   }

   public Timestamp getDtVencCertif() {
        return this.getVo().asTimestamp("DTVENCCERTIF");
   }

   public void setDtVencCertif(Timestamp dtVencCertif) {
        markAsChanged("DTVENCCERTIF", dtVencCertif);
   }

   public String getEnvEsocial() {
        return this.getVo().asString("ENVESOCIAL");
   }

   public void setEnvEsocial(String envEsocial) {
        markAsChanged("ENVESOCIAL", envEsocial);
   }

   public String getEnviaEmp() {
        return this.getVo().asString("ENVIAEMP");
   }

   public void setEnviaEmp(String enviaEmp) {
        markAsChanged("ENVIAEMP", enviaEmp);
   }

   public String getFeriasIntegral() {
        return this.getVo().asString("FERIASINTEGRAL");
   }

   public void setFeriasIntegral(String feriasIntegral) {
        markAsChanged("FERIASINTEGRAL", feriasIntegral);
   }

   public Timestamp getFimValeSocial() {
        return this.getVo().asTimestamp("FIMVALESOCIAL");
   }

   public void setFimValeSocial(Timestamp fimValeSocial) {
        markAsChanged("FIMVALESOCIAL", fimValeSocial);
   }

   public String getGrupoEsocial() {
        return this.getVo().asString("GRUPOESOCIAL");
   }

   public void setGrupoEsocial(String grupoEsocial) {
        markAsChanged("GRUPOESOCIAL", grupoEsocial);
   }

   public BigDecimal getHistCtbCrAtoCoop() {
        return this.getVo().asBigDecimal("HISTCTBCRATOCOOP");
   }

   public void setHistCtbCrAtoCoop(BigDecimal histCtbCrAtoCoop) {
        markAsChanged("HISTCTBCRATOCOOP", histCtbCrAtoCoop);
   }

   public BigDecimal getHistCtbDbAtoCoop() {
        return this.getVo().asBigDecimal("HISTCTBDBATOCOOP");
   }

   public void setHistCtbDbAtoCoop(BigDecimal histCtbDbAtoCoop) {
        markAsChanged("HISTCTBDBATOCOOP", histCtbDbAtoCoop);
   }

   public String getIdeEfr() {
        return this.getVo().asString("IDEEFR");
   }

   public void setIdeEfr(String ideEfr) {
        markAsChanged("IDEEFR", ideEfr);
   }

   public BigDecimal getIdeSubTeto() {
        return this.getVo().asBigDecimal("IDESUBTETO");
   }

   public void setIdeSubTeto(BigDecimal ideSubTeto) {
        markAsChanged("IDESUBTETO", ideSubTeto);
   }

   public BigDecimal getIdMaior() {
        return this.getVo().asBigDecimal("IDMAIOR");
   }

   public void setIdMaior(BigDecimal idMaior) {
        markAsChanged("IDMAIOR", idMaior);
   }

   public String getPermFracionarFer() {
        return this.getVo().asString("PERMFRACIONARFER");
   }

   public void setPermFracionarFer(String permFracionarFer) {
        markAsChanged("PERMFRACIONARFER", permFracionarFer);
   }

   public String getPermAbonoPec() {
        return this.getVo().asString("PERMABONOPEC");
   }

   public void setPermAbonoPec(String permAbonoPec) {
        markAsChanged("PERMABONOPEC", permAbonoPec);
   }

   public String getIntegraEmpPortalRh() {
        return this.getVo().asString("INTEGRAEMPPORTALRH");
   }

   public void setIntegraEmpPortalRh(String integraEmpPortalRh) {
        markAsChanged("INTEGRAEMPPORTALRH", integraEmpPortalRh);
   }

   public BigDecimal getCodEmpFin() {
        return this.getVo().asBigDecimal("CODEMPFIN");
   }

   public void setCodEmpFin(BigDecimal codEmpFin) {
        markAsChanged("CODEMPFIN", codEmpFin);
   }

   public String getAprovadp() {
        return this.getVo().asString("APROVADP");
   }

   public void setAprovadp(String aprovadp) {
        markAsChanged("APROVADP", aprovadp);
   }

   public String getPortalAltCargaHoraria() {
        return this.getVo().asString("PORTALALTCARGAHORARIA");
   }

   public void setPortalAltCargaHoraria(String portalAltCargaHoraria) {
        markAsChanged("PORTALALTCARGAHORARIA", portalAltCargaHoraria);
   }

   public String getFapNaoPublicada() {
        return this.getVo().asString("FAPNAOPUBLICADA");
   }

   public void setFapNaoPublicada(String fapNaoPublicada) {
        markAsChanged("FAPNAOPUBLICADA", fapNaoPublicada);
   }

   public String getDebSusEsocial() {
        return this.getVo().asString("DEBSUSESOCIAL");
   }

   public void setDebSusEsocial(String debSusEsocial) {
        markAsChanged("DEBSUSESOCIAL", debSusEsocial);
   }

   public String getPermFeriasAntecip() {
        return this.getVo().asString("PERMFERIASANTECIP");
   }

   public void setPermFeriasAntecip(String permFeriasAntecip) {
        markAsChanged("PERMFERIASANTECIP", permFeriasAntecip);
   }

   public Timestamp getApuracaoCompetencia() {
        return this.getVo().asTimestamp("APURACOMPETENCIA");
   }

   public void setApuracaoCompetencia(Timestamp apuracaoCompetencia) {
        markAsChanged("APURACOMPETENCIA", apuracaoCompetencia);
   }

   public String getPermApuracaoCompet() {
        return this.getVo().asString("PERMAPURACOMPET");
   }

   public void setPermApuracaoCompet(String permApuracaoCompet) {
        markAsChanged("PERMAPURACOMPET", permApuracaoCompet);
   }

   public Timestamp getDtVirada() {
        return this.getVo().asTimestamp("DTVIRADA");
   }

   public void setDtVirada(Timestamp dtVirada) {
        markAsChanged("DTVIRADA", dtVirada);
   }

   public String getInAptApInexist() {
        return this.getVo().asString("INAPTAPINEXIST");
   }

   public void setInAptApInexist(String inAptApInexist) {
        markAsChanged("INAPTAPINEXIST", inAptApInexist);
   }

   public String getIsMatriz() {
        return this.getVo().asString("ISMATRIZ");
   }

   public void setIsMatriz(String isMatriz) {
        markAsChanged("ISMATRIZ", isMatriz);
   }

   public String getPossuiS1000() {
        return this.getVo().asString("POSSUIS1000");
   }

   public void setPossuiS1000(String possuiS1000) {
        markAsChanged("POSSUIS1000", possuiS1000);
   }

   public String getTpAmbEsocial() {
        return this.getVo().asString("TPAMBESOCIAL");
   }

   public void setTpAmbEsocial(String tpAmbEsocial) {
        markAsChanged("TPAMBESOCIAL", tpAmbEsocial);
   }

   public String getBloqAcessoRh() {
        return this.getVo().asString("BLOQACESSORH");
   }

   public void setBloqAcessoRh(String bloqAcessoRh) {
        markAsChanged("BLOQACESSORH", bloqAcessoRh);
   }

   public String getBloqAcessoSnk() {
        return this.getVo().asString("BLOQACESSOSNK");
   }

   public void setBloqAcessoSnk(String bloqAcessoSnk) {
        markAsChanged("BLOQACESSOSNK", bloqAcessoSnk);
   }

   public String getBloqExibAniv() {
        return this.getVo().asString("BLOQEXIBANIV");
   }

   public void setBloqExibAniv(String bloqExibAniv) {
        markAsChanged("BLOQEXIBANIV", bloqExibAniv);
   }

   @Override
   public String getTableName() {
        return "TFPEMP";
   }

   @Override
   public String getEntityName() {
        return "EmpresaPessoal";
   }

   @Override
   public EmpresaPessoal fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
